/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataContext;

import business.TheBusiness.Business;
import business.TheBusiness.ConfigureASystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author NIKESH
 */
public class DataContext {
     private static final String FILENAME = Paths.get("test_database.db4o").toAbsolutePath().toString();
    private static DataContext dB4OUtil;
    
    public synchronized static DataContext getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DataContext();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private static ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            
            config.common().activationDepth(Integer.MAX_VALUE);
            
            config.common().updateDepth(Integer.MAX_VALUE);
            
            config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save

            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public static synchronized Business setBusiness(Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
        return system;
    }
    
    
    public Business retrieveBusiness(){
        ObjectContainer conn = createConnection();
        System.out.println("Connection created.....");
        ObjectSet<Business> businesses = conn.query(Business.class);
        Business business;
        if (businesses.isEmpty()) {
            System.out.println("Object sets are empty, ConfigureASystem has been called");
            business = ConfigureASystem.configure();
        } else {
            System.out.println("Object sets are not empty, getting the latest one");
            business = businesses.get(businesses.size() - 1);
            if(business.getUserDirectory().getUserAccountList().isEmpty()){
                System.out.println("No users accounts created");
            }
        }
        
        //Dispose conn object
        conn.close();
        return business;
    }
}
