/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.TheBusiness;

import business.Broker.Brokerage;
import business.Compliance.Compliance;
import business.Investor.InvestorDirectory;
import business.Market.Market;
import business.UserAccount.UserAccountDirectory;

/**
 *
 * @author NIKESH
 */
public class Business {
    
    private UserAccountDirectory userAccountDirectory;
    private InvestorDirectory investorDirectory;
    private Compliance compliance;
    private Brokerage brokerage;
    private Market market;
    private int userCount = 0;
    
    public Business(){
        userAccountDirectory = new UserAccountDirectory();
        investorDirectory = new InvestorDirectory();
        compliance = new Compliance();
        brokerage = new Brokerage();
    }
    
    public UserAccountDirectory getUserDirectory() {
        return userAccountDirectory;
    }

    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userAccountDirectory = userDirectory;
    } 
    
    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public InvestorDirectory getInvestorDirectory() {
        return investorDirectory;
    }

    public void setInvestorDirectory(InvestorDirectory investorDirectory) {
        this.investorDirectory = investorDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public Compliance getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Brokerage getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(Brokerage brokergae) {
        this.brokerage = brokergae;
    }
    
    
}
