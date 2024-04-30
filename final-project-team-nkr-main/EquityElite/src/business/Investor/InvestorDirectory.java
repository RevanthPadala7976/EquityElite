/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Investor;

import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class InvestorDirectory {
    private ArrayList<Investor> investorDirectory;
    
    public InvestorDirectory() {
       this.investorDirectory = new ArrayList<>();
    }

    public ArrayList<Investor> getInvestorDirectory() {
        return investorDirectory;
    }

    public void setInvestorDirectory(ArrayList<Investor> investorDirectory) {
        this.investorDirectory = investorDirectory;
    }
    
    
}
