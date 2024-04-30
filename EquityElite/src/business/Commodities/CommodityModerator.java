/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Commodities;

import business.UserAccount.User;

/**
 *
 * @author NIKESH
 */
public class CommodityModerator extends User {
    
    private CommodityMarket assignedMarket;
    
    public CommodityModerator(){
        
    }

    public CommodityMarket getCommodityMarket() {
        return assignedMarket;
    }

    public void setCommodityMarket(CommodityMarket commodityMarket) {
        this.assignedMarket = commodityMarket;
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
    
    
}
