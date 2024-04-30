/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Commodities;

import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class CommodityMarket {
    
    private ArrayList<Commodity> commodityList;
    private CommodityModerator commodityModerator;
    
    public CommodityMarket(){
        commodityList = new ArrayList<>();
    }

    public ArrayList<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(ArrayList<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    public CommodityModerator getCommodityModerator() {
        return commodityModerator;
    }

    public void setCommodityModerator(CommodityModerator commodityModerator) {
        this.commodityModerator = commodityModerator;
    }
    
    public Commodity getCommodityByName(String name){
        for(Commodity commodity:this.commodityList){
            if(commodity.getCommodityName().equals(name)){
                return commodity;
            }
        }
        return null;
    }
}
