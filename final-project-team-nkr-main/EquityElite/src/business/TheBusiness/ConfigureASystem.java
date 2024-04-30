/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.TheBusiness;

import business.Broker.Brokerage;
import business.Broker.BrokerageModerator;
import business.Commodities.CommodityBroker;
import business.Commodities.Commodity;
import business.Commodities.CommodityMarket;
import business.Commodities.CommodityModerator;
import business.Company.Company;
import business.Company.CompanyManager;
import business.Compliance.Compliance;
import business.Compliance.ComplianceModerator;
import business.InvestmentManager.InvestmentManager;
import business.Investor.Investor;
import business.Investor.InvestorDirectory;
import business.Market.Market;
import business.MarketAnalyst.MarketAnalyst;
import business.Stocks.StockBroker;
import business.Stocks.StockMarket;
import business.Stocks.StockMarketModerator;
import userInterface.WorkAreas.BrokerageModeratorRole;
import userInterface.WorkAreas.CommodityBrokerRole;
import userInterface.WorkAreas.CommodityModeratorRole;
import userInterface.WorkAreas.CompanyManagerRole;
import userInterface.WorkAreas.ComplianceModeratorRole;
import userInterface.WorkAreas.InvestmentManagerRole;
import userInterface.WorkAreas.InvestorRole;
import userInterface.WorkAreas.MarketAnalystRole;
import userInterface.WorkAreas.StockBrokerRole;
import userInterface.WorkAreas.StockMarketModeratorRole;

/**
 *
 * @author NIKESH
 */
public class ConfigureASystem {
    
    public static Business configure(){
        
        Business business = new Business();
        
        // Investor Directory
        InvestorDirectory investorDirectory = new InvestorDirectory();
        business.setInvestorDirectory(investorDirectory);
        
        Investor investor1 = new Investor();
        investor1.setName("Nikesh");
        investor1.setUserId(getUserCount(business));
        business.getUserDirectory().createUserAccount("nikesh", "nikesh", investor1, new InvestorRole());
        
        for(Investor i : business.getInvestorDirectory().getInvestorDirectory()){
            System.out.println(i.getName());
        }
        
        CompanyManager companyManager = new CompanyManager();
        companyManager.setName("Compnay Manager");
        companyManager.setUserId(getUserCount(business));
        business.getUserAccountDirectory().createUserAccount("manager", "manager", companyManager, new CompanyManagerRole());
        
        
        Company company = new Company();
        company.setAssets(10000000);
        company.setLiabilites(10000);
        company.setCapital(company.getCapital());
        company.setRevenue(company.getAssets() - company.getLiabilites());
        company.setLicenseRequestStatus("Approved");
        company.setLicenseStatus("Approved");
        company.setName("Apple");
        company.setListingRequestStatus("Listed");
        company.setCompanyManager(companyManager);
        companyManager.getCompanyList().add(company);
        
        
        InvestmentManager im = new InvestmentManager();
        im.setName("Investment Manager");
        im.setUserId(getUserCount(business));
        business.getUserAccountDirectory().createUserAccount("imanager", "imanager", im, new InvestmentManagerRole());
        
        
        
        
        
        ComplianceModerator complianceModerator = new ComplianceModerator();
        complianceModerator.getCompanyList().add(company);
        complianceModerator.getCompanyManagers().add(companyManager);
        complianceModerator.getInvestmentManagers().add(im);
        
        business.getUserDirectory().createUserAccount("llc", "llc", complianceModerator, new ComplianceModeratorRole());
        
        Compliance compliance = new Compliance();
        compliance.getCompanyDirectory().add(company);
        compliance.setComplianceModerator(complianceModerator);
        
        
        
        StockMarketModerator stockMarketModerator = new StockMarketModerator();
        stockMarketModerator.setName("Securities and Exchange Commission");
        stockMarketModerator.setUserId(getUserCount(business));
        
        StockMarket stockMarket = new StockMarket();
        stockMarket.setStockMarketModerator(stockMarketModerator);
        
        Market market = new Market();
        market.setStockMarket(stockMarket);
        
        business.getUserAccountDirectory().createUserAccount("sebi", "sebi", stockMarketModerator, new StockMarketModeratorRole());
        
        
        business.setCompliance(compliance);
        business.setMarket(market);
        
        business.getMarket().getStockMarket().getMarketList().add("New York Stock Exchange");
        business.getMarket().getStockMarket().getMarketList().add("Boston Stock Exchange");
        
        Brokerage brokerage = new Brokerage();
        
        StockBroker stockBroker = new StockBroker();
        stockBroker.setName("Zerodha");
        stockBroker.setAssignedMarket(business.getMarket().getStockMarket().getMarketList().get(0));
        stockBroker.setUserId(getUserCount(business));
        
        CommodityBroker commodityBroker = new CommodityBroker();
        commodityBroker.setName("Golden Eagle");
        
        CommodityBroker commodityBroker1 = new CommodityBroker();
        commodityBroker1.setName("APMEX");
        
        business.getUserAccountDirectory().createUserAccount("goldeneagle", "goldeneagle", commodityBroker, new CommodityBrokerRole());
        business.getUserAccountDirectory().createUserAccount("apmex", "apmex", commodityBroker1, new CommodityBrokerRole());
        
        
        stockBroker.setAssignedMarket(business.getMarket().getStockMarket().getMarketList().get(0));
        stockBroker.setUserId(getUserCount(business));
        
        
        business.getUserAccountDirectory().createUserAccount("zerodha", "zerodha", stockBroker, new StockBrokerRole());
        
        BrokerageModerator brokerageModerator = new BrokerageModerator();
        brokerageModerator.setName("Brokerage Commission");
        brokerageModerator.setUserId(getUserCount(business));
        brokerageModerator.setBrokerage(brokerage);
        brokerageModerator.getBrokerage().getStockBrokers().add(stockBroker);
        business.getUserAccountDirectory().createUserAccount("broker", "broker", brokerageModerator, new BrokerageModeratorRole());
        
        brokerage.setBrokerageModerator(brokerageModerator);
        brokerage.getCommodityBrokers().add(commodityBroker);
        brokerage.getCommodityBrokers().add(commodityBroker1);
        brokerage.setCommodityBrokers(brokerage.getCommodityBrokers());
        
        business.setBrokerage(brokerage);
        
        Commodity c1 = new Commodity("Gold", 600, "10 gm");
        Commodity c2 = new Commodity("Silver", 300, "10 gm");
        Commodity c3 = new Commodity("Platinum", 500, "10 gm");
        
        CommodityMarket commodityMarket = new CommodityMarket();
        commodityMarket.getCommodityList().add(c1);
        commodityMarket.getCommodityList().add(c2);
        commodityMarket.getCommodityList().add(c3);
        
        CommodityModerator commodityModerator = new CommodityModerator();
        
        commodityModerator.setName("Commodity Trading Commission");
        commodityModerator.setUserId(getUserCount(business));
        commodityModerator.setCommodityMarket(commodityMarket);
        commodityMarket.setCommodityModerator(commodityModerator);
        
        business.getUserAccountDirectory().createUserAccount("ctc", "ctc", commodityModerator, new CommodityModeratorRole());
        business.getMarket().setCommodityMarket(commodityMarket);
        
        
        MarketAnalyst marketAnalyst = new MarketAnalyst();
        marketAnalyst.setName("Market Analyst");
        marketAnalyst.setUserId(getUserCount(business));
        business.getUserDirectory().createUserAccount("analyst", "analyst", marketAnalyst, new MarketAnalystRole());
        
        
        return business;
        
        
        
        
        
      
    }

    
    private static int getUserCount(Business business) {
        business.setUserCount(business.getUserCount()+1);
        return(business.getUserCount());
    }
}
