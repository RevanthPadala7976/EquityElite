/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Commodities;

import business.Investor.InvestorProfile;

/**
 *
 * @author NIKESH
 */
public class CommoditySellRequest {
    
    private int saleID;
     private Commodity commodity;
    private int quantity;
    private InvestorProfile seller;
    private InvestorProfile buyer;
   
    public CommoditySellRequest(){
        
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
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
