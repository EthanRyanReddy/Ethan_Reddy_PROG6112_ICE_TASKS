//Code Attribution 
//Title: Java Arrays
//Author: w3schools
//Date: n.d
//Version: 1
//Availability: https://www.w3schools.com/java/java_arrays.asp

package com.mycompany.ice_task_1;

import java.util.Scanner;

/**
 *
 * @author reddy
 */
public class ICE_TASK_1 {

    public static void main(String[] args) {
        
        
        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        }; 
        
        String[] bouquets = {
            "Roses", "TULIPS", "LILIES"
        }; 
       
        Scanner scanner = new Scanner(System.in); 
        
        int[][] sales = new int [7][3]; 
        
        
        
        System.out.println("Enter the amount of sales for each bouquet. \n");
        
        for(int day = 0; day < days.length; day++){
            
            System.out.println(days[day]);
            
            for(int bouquet = 0; bouquet < bouquets.length; bouquet++){
                
                System.out.println("Enter sales for " + bouquets[bouquet] + ":");
                sales[day][bouquet] = scanner.nextInt();
            }
            
            System.out.println();
        }
        
        int[] bouquetTotals = new int [3]; 
        
        int weeklyTotal = 0; 
        
        System.out.println("\n\tWEEKLY SALES REPORT");
        
        System.out.printf("%-12s%-10s%-10s%-10s%-10s%n",
        "DAY", "ROSES", "TULIPS", "LILIES", "TOTAL");
        
        for(int day = 0; day < days.length; day++){
            
            int dayTotal = 0; 
            
            System.out.printf("%-12s", days[day]); 
            
            
            for(int bouquet = 0; bouquet < bouquets.length; bouquet++){
                
                System.out.printf("%-10d", sales[day][bouquet]);
                
                dayTotal += sales[day][bouquet]; 
                
                bouquetTotals[bouquet] += sales[day][bouquet];
                
            }
            
            weeklyTotal += dayTotal; 
            
              System.out.printf("%-10d%n", dayTotal);
          }
        
        System.out.printf("%-12s", "TOTAL");
        
        for (int bouquet = 0; bouquet < bouquetTotals.length; bouquet++){
            
             System.out.printf("%-10d", bouquetTotals[bouquet]);
        }
        
        System.out.printf("%-10d%n", weeklyTotal);
        
        System.out.println();
        
        for (int bouquet = 0; bouquet < bouquets.length; bouquet++) {
            
            System.out.println("Total sales for "
            + bouquets[bouquet]
            + ": "
            + bouquetTotals[bouquet]);
        
        }
        
        System.out.println("\nOverall total sales for the week: R" + weeklyTotal);

    }
}
