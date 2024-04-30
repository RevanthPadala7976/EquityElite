/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.MarketAnalyst;

import business.Company.Company;
import business.Investor.StockHoldings;
import business.Stocks.Stock;
import business.TheBusiness.Business;
import business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author revanth
 */
public class MarketAnalystJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount account;
    Stock selectedStock;
    public MarketAnalystJPanel(UserAccount account, Business business) {
        this.business=business;
        this.account=account;
        initComponents();
        showLineChart();
        showPieChart();
        showTable();
    }
    
    public void showPieChart(){
      DefaultPieDataset barDataSet = new DefaultPieDataset( );
      double smallCap = this.business.getCompliance().getComplianceModerator().getSmallCap();
      double mediumCap = this.business.getCompliance().getComplianceModerator().getMediumCap();
      double largeCap = this.business.getCompliance().getComplianceModerator().getLargeCap();
      int smallCapCount = 0;
      int mediumCapCount = 0;
      int largeCapCount = 0;
      for(Company company:this.business.getCompliance().getComplianceModerator().getCompanyList()){
          if(company.getCapital()<smallCap){
              smallCapCount++;
              continue;
          }
          else if(company.getCapital()<mediumCap){
              mediumCapCount++;
              continue;
          }
          else{
              largeCapCount++;
          }
      }
      barDataSet.setValue( "Small Cap" , smallCapCount );  
      barDataSet.setValue( "Medium Cap" , mediumCapCount );   
      barDataSet.setValue( "Large Cap" ,largeCapCount );    
      
        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Market Distribution",barDataSet, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
        piePlot.setSectionPaint("Small Cap", new Color(255,255,102));
        piePlot.setSectionPaint("Medium Cap", new Color(102,255,102));
        piePlot.setSectionPaint("Large Cap", new Color(255,102,153));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllCompanies = new javax.swing.JTable();
        panelPieChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        panelLineChart2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(85, 65, 119));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 140, 40));

        jScrollPane2.setBackground(new java.awt.Color(153, 0, 255));

        tblAllCompanies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Capital", "Assets", "Liabilities"
            }
        ));
        jScrollPane2.setViewportView(tblAllCompanies);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 860, 220));

        panelPieChart.setBackground(new java.awt.Color(255, 102, 204));
        panelPieChart.setLayout(new java.awt.BorderLayout());
        add(panelPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 480, 210));

        panelBarChart.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart.setLayout(new java.awt.BorderLayout());
        add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 450, 490));

        panelLineChart2.setBackground(new java.awt.Color(255, 255, 255));
        panelLineChart2.setLayout(new java.awt.BorderLayout());
        add(panelLineChart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 480, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tblAllCompanies.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(this, "Select a stock to show trend");
        }
        else{
            this.selectedStock=this.business.getMarket().getStockMarket().getStockByName(String.valueOf(tblAllCompanies.getValueAt(tblAllCompanies.getSelectedRow(), 0)));
            generateBarChart();
            gnerateStockTrend();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart2;
    private javax.swing.JPanel panelPieChart;
    private javax.swing.JTable tblAllCompanies;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        DefaultTableModel model = (DefaultTableModel) tblAllCompanies.getModel();
        model.setRowCount(0);
        for(Company company: this.business.getCompliance().getComplianceModerator().getCompanyList()){
            System.out.println("Iterating in loop, so companies exists : " + company.getName() + " " + company.getListingRequestStatus());
            
            if(company.getListingRequestStatus().equals("Listed")){
                Object[] row= new Object[4];
                row[0]=company.getName();
                row[1]=company.getCapital();
                row[2]=company.getAssets();
                row[3]=company.getLiabilites();
                model.addRow(row);
            }
        }
    }

    private void changeScreen(JPanel newJPanel) {
        this.removeAll();
        this.add(newJPanel);
        this.revalidate();
        this.repaint();
    }

    private void generateBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(this.selectedStock.getAvailableQuantity(), "Stakes", "Promoters");
        int otherCompanyHoldings=0;
        for(Company company:this.business.getCompliance().getComplianceModerator().getCompanyList()){
            for(StockHoldings stockHoldings:company.getStockHoldings()){
                if(stockHoldings.getStock()==this.selectedStock){
                    dataset.setValue(stockHoldings.getQuantity(), "Stakes", company.getName());
                    otherCompanyHoldings+=stockHoldings.getQuantity();
                }
            }
        }
        int publicHoldings = (this.selectedStock.getStockQuantity()-this.selectedStock.getAvailableQuantity())-otherCompanyHoldings;
        dataset.setValue(publicHoldings, "Stakes", "Public");
        
        JFreeChart chart = ChartFactory.createBarChart("Holding Pattern","Stakes","Holder", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBarChart.removeAll();
        panelBarChart.add(barpChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }

    private void gnerateStockTrend() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int count=0;
        for(Double price :selectedStock.getPriceHistory()){
            System.out.println(price);
            dataset.setValue(price, "price",String.valueOf(++count));
        }        
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Market trend","timeline","price", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart2.removeAll();
        panelLineChart2.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart2.validate();
    }

    private void showLineChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int count=0;
        for(Double index : this.business.getMarket().getStockMarket().getMarketHistory()){
            dataset.setValue(index, "index",String.valueOf(++count));
        }        
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Sensitivity Index","timeline","price", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
//        panelLineChart.removeAll();
//        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
//        panelLineChart.validate();
    }
}