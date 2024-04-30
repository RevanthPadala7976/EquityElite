/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Investor;

import business.Commodities.Commodity;

/**
 *
 * @author NIKESH
 */
public class CommodityHoldings {
    
    private Commodity commodity;
    private int quantity;
    private double actualPrice;
    
    public CommodityHoldings(){
        
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

    public double getBuyingPrice() {
        return actualPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.actualPrice = buyingPrice;
    }

}
