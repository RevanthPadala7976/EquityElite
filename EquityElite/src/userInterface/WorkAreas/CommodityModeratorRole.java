/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.WorkAreas;

import business.Roles.Role;
import business.TheBusiness.Business;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Moderator.CommodityModaratorJPanel;

/**
 *
 * @author kusumanth
 */
public class CommodityModeratorRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business) {
        return new CommodityModaratorJPanel(userProcessContainer, account, business); 
    }
}
