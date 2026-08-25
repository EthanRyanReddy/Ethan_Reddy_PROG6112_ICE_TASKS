/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task_3;

import java.util.Scanner;

/**
 *
 * @author reddy
 */
public class ICE_TASK_3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        int itemNum = 0; 
        int quantity = 0; 
        double amount = 0.0; 
        
        try{
            
            System.out.println("Please enter the item number: ");
            
            String inputItemNum = scanner.nextLine(); 
            
            try{
                
                itemNum = Integer.parseInt(inputItemNum); 
                
            }catch (NumberFormatException e){
                throw new Order_Exception(Message.MESSAGES[0]); 
            }
            
            if(itemNum < 0 || itemNum > 9999){
                
                throw new Order_Exception(Message.MESSAGES[1]); 
            }
            
            switch(itemNum){
                
                case 111: 
                    amount = 0.89; 
                    break; 
                    
                case 222:
                    
                    amount = 1.47; 
                    break; 
                    
                case 333:
                    amount = 2.43; 
                    break; 
                    
                case 444: 
                    
                    amount = 5.99; 
                    break; 
                    
                default:
                    throw new Order_Exception(Message.MESSAGES[4]); 
                    
            }
            
            System.out.println("Enter the amount you want to buy: ");
            String userAmount = scanner.nextLine(); 
            
            try{
                
                quantity = Integer.parseInt(userAmount); 
            }
            
            catch(NumberFormatException e){
                
                throw new Order_Exception(Message.MESSAGES[12]); 
            }
            
            if(quantity < 1 || quantity > 12){
                
                throw new Order_Exception(Message.MESSAGES[3]); 
            }
            
            double total = quantity * amount; 
            
            System.out.printf("Total amoutn due: $%.2f%n", total); 
            
        }
        catch(Order_Exception e){
            System.out.println("An Error has occured" + e.getMessage());
        }
        
        scanner.close(); 
    }
}
