/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stocks;

import business.Investor.InvestorProfile;

/**
 *
 * @author kusumanth
 */
public class StockSellRequest {
    
    private int saleID;
    private Stock stock;
    private int quantity;
    private InvestorProfile seller;
    private InvestorProfile buyer;
    
    public StockSellRequest(){
        
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int purchaseID) {
        this.saleID = purchaseID;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public InvestorProfile getSeller() {
        return seller;
    }

    public void setSeller(InvestorProfile seller) {
        this.seller = seller;
    }

    public InvestorProfile getBuyer() {
        return buyer;
    }

    public void setBuyer(InvestorProfile buyer) {
        this.buyer = buyer;
    }
    
    
}
