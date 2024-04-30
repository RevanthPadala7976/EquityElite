/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stocks;

import business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class StockBroker extends User {
    
    private ArrayList<StockPurchaseRequest> purchaseRequests;
    private ArrayList<StockSellRequest> sellRequests;
    private String assignedMarket;
    private float rating;
    
    public StockBroker(){
        purchaseRequests= new ArrayList<>();
        sellRequests= new ArrayList<>();
    }

    public ArrayList<StockPurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    public void setPurchaseRequests(ArrayList<StockPurchaseRequest> purchaseRequests) {
        this.purchaseRequests = purchaseRequests;
    }

    public ArrayList<StockSellRequest> getSellRequests() {
        return sellRequests;
    }

    public void setSellRequests(ArrayList<StockSellRequest> sellRequests) {
        this.sellRequests = sellRequests;
    }

    public String getAssignedMarket() {
        return assignedMarket;
    }

    public void setAssignedMarket(String assignedMarket) {
        this.assignedMarket = assignedMarket;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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
    
    public StockPurchaseRequest getPurchaseRequestByID(int id){
        for(StockPurchaseRequest stockPurchaseRequest: purchaseRequests){
            if(stockPurchaseRequest.getPurchaseID()==id){
                return stockPurchaseRequest;
            }
        }
        return null;
    }
    
    public StockSellRequest getStockSellRequestByID(int id){
        for(StockSellRequest stockSellRequest : sellRequests){
            if(stockSellRequest.getSaleID()==id){
                return stockSellRequest;
            }
        }
        
        return null;
    }
}
