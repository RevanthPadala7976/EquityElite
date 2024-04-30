/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Job;

import business.Company.Company;
import business.InvestmentManager.InvestmentManager;

/**
 *
 * @author NIKESH
 */
public class JobRequest {
    
    private Company company;
    private double salaryRequest;
    private float experience;
    private InvestmentManager appliedManager;
    
    public JobRequest(){
        
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalaryRequest() {
        return salaryRequest;
    }

    public void setSalaryRequest(double salaryRequest) {
        this.salaryRequest = salaryRequest;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public InvestmentManager getAppliedManager() {
        return appliedManager;
    }

    public void setAppliedManager(InvestmentManager appliedManager) {
        this.appliedManager = appliedManager;
    }
    
    
    
    
}
