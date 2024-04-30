/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Commodities;

/**
 *
 * @author NIKESH
 */
public class Commodity {
    
    private String commodityName;
    private float commodityPrice;
    private String units;
    
    public Commodity(String name, float price, String units){
        this.commodityName = name;
        this.commodityPrice = price;
        this.units = units;
    }
    
    public Commodity(){
        
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public float getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(float commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
    
    
}
