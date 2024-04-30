/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Company;

import business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class CompanyManager extends User {
    private ArrayList<Company> companyList;
    
    public CompanyManager(){
        super();
        this.companyList=new ArrayList<>();
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
    
    
}
