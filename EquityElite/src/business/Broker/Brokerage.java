/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Broker;

import business.Commodities.CommodityBroker;
import business.Stocks.StockBroker;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class Brokerage {
    
    private int purchaseRequestCount;
    private int sellRequestCount;
    private ArrayList<StockBroker> stockBrokers;
    private ArrayList<CommodityBroker> commodityBrokers;
    private BrokerageModerator brokerageModerator;
    
    
    public Brokerage(){
        stockBrokers = new ArrayList<>();
        purchaseRequestCount = 0;
        sellRequestCount = 0;
        commodityBrokers = new ArrayList<>();
    }

    public int getPurchaseRequestCount() {
        return purchaseRequestCount;
    }

    public void setPurchaseRequestCount(int purchaseRequestCount) {
        this.purchaseRequestCount = purchaseRequestCount;
    }

    public int getSellRequestCount() {
        return sellRequestCount;
    }

    public void setSellRequestCount(int sellRequestCount) {
        this.sellRequestCount = sellRequestCount;
    }

    public ArrayList<StockBroker> getStockBrokers() {
        return stockBrokers;
    }

    public void setStockBrokers(ArrayList<StockBroker> stockBrokers) {
        this.stockBrokers = stockBrokers;
    }

    public BrokerageModerator getBrokerageModerator() {
        return brokerageModerator;
    }

    public void setBrokerageModerator(BrokerageModerator brokerageModerator) {
        this.brokerageModerator = brokerageModerator;
    }
    
    public StockBroker getStockBrokerByName(String name){
        for(StockBroker stockBroker : stockBrokers){
            if(stockBroker.getName().equalsIgnoreCase(name)){
                return stockBroker;
            }
        }
        
        return null;
    }

    public ArrayList<CommodityBroker> getCommodityBrokers() {
        return commodityBrokers;
    }

    public void setCommodityBrokers(ArrayList<CommodityBroker> commodityBrokers) {
        this.commodityBrokers = commodityBrokers;
    }
    
    public CommodityBroker getCommodityBrokerByName(String name){
        for(CommodityBroker commodityBroker: commodityBrokers){
            if(commodityBroker.getName().equals(name)){
                return commodityBroker;
            }
        }
        return null;
    }
    
}
