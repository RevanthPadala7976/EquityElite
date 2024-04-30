/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Roles;

import business.TheBusiness.Business;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author NIKESH
 */
public abstract class Role {
    
    public enum RoleType{
        
        BrokerageModerator("BrokerageModerator"),
        CommodityBroker("CommodityBroker"),
        EquityBroker("EquityBroker"),
        EstablishmentsModerator("EstablishmentsModerator"),
        CompanyManager("CompanyManager"),
        InvestmentManager("InvestmentManager"),
        DayTrader("DayTrader"),
        RetailInvestor("RetailInvestor"),
        CommodityMarketModerator("CommodityMarketModerator"),
        EquityMarketModerator("EquityMarketModerator"); 
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business); 
}
