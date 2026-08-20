/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task_2;

/**
 *
 * @author reddy
 */
public class ICE_TASK_2 {

    public static void main(String[] args) {
        
        salesAgent agent1 = new salesAgent(
                "Trevor Phillips", 
                "SA001", 
                200000, 
                12, 
                1000
        ); 
        
        salesAgent agent2 = new salesAgent(
                "Michael De Santa", 
                "SA002", 
                350000, 
                14, 
                2000
        ); 
        
        salesAgent agent3 = new salesAgent(
                "Frankin Richards", 
                "SA003", 
                450000, 
                20, 
                1500
        ); 
        
        salesAgent agent4 = new salesAgent(
                "Lamar Davis", 
                "SA004", 
                250000, 
                11, 
                500
        ); 
        
        agent1.printReport();
        agent2.printReport();
        agent3.printReport();
        agent4.printReport();
        
        agent2.generateQoute(); 
    }
}
