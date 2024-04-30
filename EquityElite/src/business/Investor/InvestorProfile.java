/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Investor;

import business.Commodities.CommodityPurchaseRequest;
import business.Commodities.CommoditySellRequest;
import business.Stocks.Stock;
import business.Stocks.StockPurchaseRequest;
import business.Stocks.StockSellRequest;
import business.UserAccount.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NIKESH
 */
public class InvestorProfile extends User {
    
    private double balance;
    private ArrayList<StockPurchaseRequest> stockPurchaseRequests;
    private ArrayList<StockSellRequest> stockSellRequests;
    private ArrayList<StockHoldings> stockHoldings;
    private ArrayList<CommodityPurchaseRequest> commodityPurchaseRequests;
    private ArrayList<CommoditySellRequest> commoditySellRequests;
    private ArrayList<CommodityHoldings> commodityHoldings;
    
    private Map<Stock, Integer> holdings;
    
    public InvestorProfile(){
        
        stockPurchaseRequests = new ArrayList<>();
        stockSellRequests = new ArrayList<>();
        stockHoldings = new ArrayList<>();
        balance = 0;
        holdings = new HashMap<>();
        commodityHoldings = new ArrayList<>();
        commodityPurchaseRequests = new ArrayList<>();
        commoditySellRequests = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<StockPurchaseRequest> getStockBuyRequests() {
        return stockPurchaseRequests;
    }

    public void setStockBuyRequests(ArrayList<StockPurchaseRequest> stockBuyRequests) {
        this.stockPurchaseRequests = stockBuyRequests;
    }

    public ArrayList<StockSellRequest> getStockSellRequests() {
        return stockSellRequests;
    }

    public void setStockSellRequests(ArrayList<StockSellRequest> stockSellRequests) {
        this.stockSellRequests = stockSellRequests;
    }

    public ArrayList<StockHoldings> getStockHoldings() {
        if(stockHoldings == null){
            setStockHoldings(new ArrayList<>());
        }
        return stockHoldings;
    }

    public void setStockHoldings(ArrayList<StockHoldings> stockHoldings) {
        this.stockHoldings = stockHoldings;
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

    public Map<Stock, Integer> getHoldings() {
        return holdings;
    }

    public void setHoldings(Map<Stock, Integer> holdings) {
        this.holdings = holdings;
    }

    public ArrayList<CommodityPurchaseRequest> getCommodityPurchaseRequests() {
        return commodityPurchaseRequests;
    }

    public void setCommodityPurchaseRequests(ArrayList<CommodityPurchaseRequest> commodityPurchaseRequests) {
        this.commodityPurchaseRequests = commodityPurchaseRequests;
    }

    public ArrayList<CommoditySellRequest> getCommoditySellRequests() {
        return commoditySellRequests;
    }

    public void setCommoditySellRequests(ArrayList<CommoditySellRequest> commoditySellRequests) {
        this.commoditySellRequests = commoditySellRequests;
    }

    public ArrayList<CommodityHoldings> getCommodityHoldings() {
        if(commodityHoldings==null){
            setCommodityHoldings(new ArrayList<>());
        }
        return commodityHoldings;
    }

    public void setCommodityHoldings(ArrayList<CommodityHoldings> commodityHoldings) {
        this.commodityHoldings = commodityHoldings;
    }
    
    
    
    
    
    
}
