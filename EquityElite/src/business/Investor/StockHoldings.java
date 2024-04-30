/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Investor;

import business.Stocks.Stock;

/**
 *
 * @author NIKESH
 */
public class StockHoldings {
    
    
    private double actualPrice;
    private int quantity;
    private Stock stock;
    
    public StockHoldings(){
        this.quantity = 0;
        this.actualPrice = 0;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
    
}
