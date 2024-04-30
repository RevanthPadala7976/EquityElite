/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Listing;

import business.Company.Company;

/**
 *
 * @author NIKESH
 */
public class ListingRequest {
    
    private int requestId;
    private Company company;
    private Double sharePrice;
    private int totalShares;
    private String status;
    
      public ListingRequest(Company company, Double sharePrice, int totalShares){
        this.company=company;
        this.sharePrice=sharePrice;
        this.totalShares=totalShares;
        this.status="Pending";
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      
      
      
    
}
