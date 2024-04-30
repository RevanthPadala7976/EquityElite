/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Market;

import business.Commodities.CommodityMarket;
import business.Stocks.StockMarket;

/**
 *
 * @author NIKESH
 */
public class Market {
    
    
    private StockMarket stockMarket;
    private CommodityMarket commodityMarket;
    
    public Market(){
        
    }

    public StockMarket getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    public CommodityMarket getCommodityMarket() {
        return commodityMarket;
    }

    public void setCommodityMarket(CommodityMarket commodityMarket) {
        this.commodityMarket = commodityMarket;
    }
    
    
    
    
}
