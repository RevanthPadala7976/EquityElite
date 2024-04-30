/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Commodities;

import business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class CommodityBroker extends User {
    
    private ArrayList<CommodityPurchaseRequest> purchaseRequests;
    private ArrayList<CommoditySellRequest> sellRequests;
    
    public CommodityBroker(){
        purchaseRequests = new ArrayList<>();
        sellRequests = new ArrayList<>();
    }

    public ArrayList<CommodityPurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    public void setPurchaseRequests(ArrayList<CommodityPurchaseRequest> purchaseRequests) {
        this.purchaseRequests = purchaseRequests;
    }

    public ArrayList<CommoditySellRequest> getSellRequests() {
        return sellRequests;
    }

    public void setSellRequests(ArrayList<CommoditySellRequest> sellRequests) {
        this.sellRequests = sellRequests;
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
    
    public CommodityPurchaseRequest getBuyRequestById(int id){
        for(CommodityPurchaseRequest commodityPurchaseRequest: purchaseRequests){
            if(commodityPurchaseRequest.getPurchaseID()==id){
                return commodityPurchaseRequest;
            }
        }
        return null;
    }
    public CommoditySellRequest getSellRequestById(int id){
        for(CommoditySellRequest commoditySellRequest: sellRequests){
            if(commoditySellRequest.getSaleID()==id){
                return commoditySellRequest;
            }
        }
        return null;
    } 
}
