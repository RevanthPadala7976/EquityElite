/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stocks;

import business.Company.Company;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class StockMarket {
    
    private ArrayList<Stock> stockList;
    private StockMarketModerator stockMarketModerator;
    private String marketName = "Boston Stock Exchange";
    private ArrayList<String> marketList;
    private ArrayList<Double> marketHistory;
    
    public StockMarket(){
        stockList = new ArrayList<>();
        marketList = new ArrayList<String>();
        marketHistory = new ArrayList<Double>();
    }

    public ArrayList<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(ArrayList<Stock> stockList) {
        this.stockList = stockList;
    }

    public StockMarketModerator getStockMarketModerator() {
        return stockMarketModerator;
    }

    public void setStockMarketModerator(StockMarketModerator stockMarkerModerator) {
        this.stockMarketModerator = stockMarkerModerator;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public ArrayList<String> getMarketList() {
       if(marketList==null){
            setMarketList(new ArrayList<>());
        }
        return marketList;
    }

    public void setMarketList(ArrayList<String> marketList) {
        this.marketList = marketList;
    }

    public ArrayList<Double> getMarketHistory() {
        return marketHistory;
    }

    public void setMarketHistory(ArrayList<Double> marketHistory) {
        this.marketHistory = marketHistory;
    }
    
    public Stock getStockByName(String name){
        for(Stock stock: this.stockList){
            if(stock.getCompany().getName().equals(name) && stock.getAvailableQuantity()>0){
                return stock;
            }
        }
        return null;
    }
    
      public void updateMarketMetrics(Double newValue){
        if(marketHistory==null){
            setMarketHistory(new ArrayList<>());
        }
        marketHistory.add(newValue);
    }
      
    public Stock getCompanyStock(Company c){
        for (Stock s : stockList){
            if(s.getCompany().equals(c)){
                return s;
            }
        }
        return null;
    }
}
