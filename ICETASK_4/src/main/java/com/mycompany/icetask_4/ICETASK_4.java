/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author reddy
 */
public class ICETASK_4 {

    public static void main(String[] args) {
        
        try{
            File inputFile = new File("src\\main\\java\\com\\mycompany\\icetask_4\\accountNumbers.txt"); 
            Scanner scanner = new Scanner(inputFile);
            PrintWriter output = new PrintWriter("validAccountNumber.txt"); 
            
            while(scanner.hasNextLine()){
                
                String number = scanner.nextLine().trim() ;
                
                int sum = 0; 
                
                for(int i = 0; i < 5; i++){
                    
                    sum += Character.getNumericValue(number.charAt(i)); 
                }
                
                int numberLeft = sum % 10; 
                
                int lastDigit = Character.getNumericValue(number.charAt(5)); 
                
                if(numberLeft == lastDigit){
                    
                    System.out.println(number + " - Valid Number");
                    output.println(number);
                }else{
                    System.out.println(number + " - Invalid Number");
                }
            }
            
            scanner.close();
            
            output.close();
            
            System.out.println("All Valid Account Numbers have been written to the file vaildAccountNumbers.txt");
            
            
        }catch(FileNotFoundException e){
            System.out.println("File could not be found");
        }
        
    }
}
