/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.InvestmentManager;

import business.Company.Company;
import business.UserAccount.User;

/**
 *
 * @author NIKESH
 */
public class InvestmentManager extends User{
    
    private double salary;
    private float experience;
    private Company assignedCompany;
    
    public InvestmentManager(){
        super();
        assignedCompany = null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public Company getAssignedCompany() {
        return assignedCompany;
    }

    public void setAssignedCompany(Company assignedCompany) {
        this.assignedCompany = assignedCompany;
    }
    
    
    
}
