/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stocks;

import business.Listing.ListingRequest;
import business.UserAccount.User;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class StockMarketModerator extends User {
    
    private StockMarket assigneStockMarket;
    private ArrayList<ListingRequest> listingRequestList;
    private int requestCount = 0;
    
    public StockMarketModerator(){
        listingRequestList = new ArrayList<>();
    }

    public StockMarket getAssigneStockMarket() {
        return assigneStockMarket;
    }

    public void setAssigneStockMarket(StockMarket assigneStockMarket) {
        this.assigneStockMarket = assigneStockMarket;
    }

    public ArrayList<ListingRequest> getListingRequestList() {
        return listingRequestList;
    }

    public void setListingRequestList(ArrayList<ListingRequest> listingRequestList) {
        this.listingRequestList = listingRequestList;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
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
    
    
     public ListingRequest getListingRequestById(int id){
        for(ListingRequest listingRequest: listingRequestList){
          if(listingRequest.getRequestId()==id){
              return listingRequest;
          }  
        }
        return null;
    }
    
}
