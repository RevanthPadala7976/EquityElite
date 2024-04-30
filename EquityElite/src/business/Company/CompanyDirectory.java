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
public class CompanyDirectory{
    
    private ArrayList<Company> companyList;
    
    public CompanyDirectory(){
        companyList = new ArrayList<>();
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
    
    
    
}
