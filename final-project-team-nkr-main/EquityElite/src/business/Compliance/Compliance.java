/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Compliance;

import business.Company.Company;
import business.InvestmentManager.InvestmentManager;
import java.util.ArrayList;

/**
 *
 * @author kusumanth
 */
public class Compliance {
    
    private ArrayList<Company> companyDirectory;
    private ComplianceModerator complianceModerator;
    private ArrayList<InvestmentManager> investmentManagerDirectory;
    
    public Compliance(){
        companyDirectory = new ArrayList<>();
        
    }

    public ArrayList<Company> getCompanyDirectory() {
        return companyDirectory;
    }

    public void setCompanyDirectory(ArrayList<Company> companyDirectory) {
        this.companyDirectory = companyDirectory;
    }

    public ComplianceModerator getComplianceModerator() {
        return complianceModerator;
    }

    public void setComplianceModerator(ComplianceModerator complianceModerator) {
        this.complianceModerator = complianceModerator;
    }

    public ArrayList<InvestmentManager> getInvestmentManagerDirectory() {
        return investmentManagerDirectory;
    }

    public void setInvestmentManagerDirectory(ArrayList<InvestmentManager> investmentManagerDirectory) {
        this.investmentManagerDirectory = investmentManagerDirectory;
    }
    
    
    
}
