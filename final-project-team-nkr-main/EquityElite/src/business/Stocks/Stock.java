/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Stocks;

import business.Company.Company;
import java.util.ArrayList;

/**
 *
 * @author kusumanth
 */
public class Stock {
    
    private String symbol;
    private double price;
    private int stockQuantity;
    private int availableQuantity;
    private ArrayList<Double> priceHistory;
    private Company company;
    
    public Stock(){
        
    }
    public Stock(Company company, String symbol, int price){
        this.company = company;
        this.symbol=symbol;
        this.price=price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public ArrayList<Double> getPriceHistory() {
        if(priceHistory==null){
            setPriceHistory(new ArrayList<>());
        }
        return priceHistory;
    }

    public void setPriceHistory(ArrayList<Double> priceHistory) {
        this.priceHistory = priceHistory;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    public void calculateAndSetPrice() {
        setPrice(this.company.getCapital()/this.stockQuantity);
    }
}
