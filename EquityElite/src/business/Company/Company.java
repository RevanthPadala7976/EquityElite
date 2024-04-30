/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Company;

import business.InvestmentManager.InvestmentManager;
import business.Investor.InvestorProfile;
import business.Investor.StockHoldings;
import business.Job.JobRequest;
import java.util.ArrayList;

/**
 *
 * @author NIKESH
 */
public class Company extends InvestorProfile {
    
    private double assets;
    private double liabilites;
    private double capital;
    private double revenue;
    private String licenseRequestStatus;
    private String licenseStatus;
    private InvestmentManager investmentManager;
    private ArrayList<JobRequest> jobRequests;
    private CompanyManager companyManager;
    private String listingRequestStatus;
    
    public Company(){
        super();
        investmentManager = null;
        listingRequestStatus = "Not Initiated";
    }

    public double getAssets() {
        return assets;
    }

    public void setAssets(double assets) {
        this.assets = assets;
    }

    public double getLiabilites() {
        return liabilites;
    }

    public void setLiabilites(double liabilites) {
        this.liabilites = liabilites;
    }

    public double getCapital() {
        double balance=this.getBalance();
        double investment=0;
        for(StockHoldings stockHoldings : this.getStockHoldings()){
            investment+=(stockHoldings.getStock().getPrice()*stockHoldings.getQuantity());
        }
        balance+=investment;
        this.setCapital(balance);
        return this.capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getLicenseRequestStatus() {
        return licenseRequestStatus;
    }

    public void setLicenseRequestStatus(String licenseRequestStatus) {
        this.licenseRequestStatus = licenseRequestStatus;
    }

    public String getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }
    
    public void CalculateMarkertCap(double marketCapital){
        double investment=0;
        for(StockHoldings stockHoldings:this.getStockHoldings()){
            investment+=(stockHoldings.getStock().getPrice()*stockHoldings.getQuantity());
        }
        double balance = marketCapital-investment;
        this.setBalance(balance);
    }

    public InvestmentManager getInvestmentManager() {
        return investmentManager;
    }

    public void setInvestmentManager(InvestmentManager investmentManager) {
        this.investmentManager = investmentManager;
    }
    
    public ArrayList<JobRequest> getJobRequest() {
        if(jobRequests==null){
            this.setJobRequest(new ArrayList<>());
        }
        return jobRequests;
    }

    public void setJobRequest(ArrayList<JobRequest> jobRequest) {
        this.jobRequests = jobRequest;
    }

    public CompanyManager getCompanyManager() {
        return companyManager;
    }

    public void setCompanyManager(CompanyManager companyManager) {
        this.companyManager = companyManager;
    }

    public ArrayList<JobRequest> getJobRequests() {
        return jobRequests;
    }

    public void setJobRequests(ArrayList<JobRequest> jobRequests) {
        this.jobRequests = jobRequests;
    }

    public String getListingRequestStatus() {
        return listingRequestStatus;
    }

    public void setListingRequestStatus(String listingRequestStatus) {
        this.listingRequestStatus = listingRequestStatus;
    }
    
    
    
}
