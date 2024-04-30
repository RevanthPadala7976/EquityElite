/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Compliance;

import business.Company.Company;
import business.Company.CompanyManager;
import business.InvestmentManager.InvestmentManager;
import business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author kusumanth
 */
public class ComplianceModerator extends User{
    
    private Compliance compliance;
    private ArrayList<Company> companyList;
    private ArrayList<CompanyManager> companyManagers;
    private ArrayList<InvestmentManager> investmentManagers;
    private double smallCap;
    private double mediumCap;
    private double largeCap;
    
    public ComplianceModerator(){
        super();
        companyList = new ArrayList<>();
        companyManagers = new ArrayList<>();
        investmentManagers = new ArrayList<>();
    }

    public Compliance getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }

    public ArrayList<CompanyManager> getCompanyManagers() {
        return companyManagers;
    }

    public void setCompanyManagers(ArrayList<CompanyManager> companyManagers) {
        this.companyManagers = companyManagers;
    }

    public ArrayList<InvestmentManager> getInvestmentManagers() {
        return investmentManagers;
    }

    public void setInvestmentManagers(ArrayList<InvestmentManager> investmentManagers) {
        this.investmentManagers = investmentManagers;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Company getCompanyByName(String name){
        for(Company company : companyList){
            if(company.getName().equalsIgnoreCase(name)){
                return company;
            }
        }
        
        return null;
    }
    
    public InvestmentManager getInvestmentManagerByName(String name){
        for(InvestmentManager im : investmentManagers){
            if(im.getName().equalsIgnoreCase(name)){
                return im;
            }
        }
        
        return null;
    }
    
    public double getSmallCap() {
        return smallCap;
    }

    public void setSmallCap(double smallCap) {
        this.smallCap = smallCap;
    }

    public double getMediumCap() {
        return mediumCap;
    }

    public void setMediumCap(double mediumCap) {
        this.mediumCap = mediumCap;
    }

    public double getLargeCap() {
        return largeCap;
    }

    public void setLargeCap(double largeCap) {
        this.largeCap = largeCap;
    }
}
