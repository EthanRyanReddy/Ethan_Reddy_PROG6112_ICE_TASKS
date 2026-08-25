package com.mycompany.ice_task_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reddy
 */
public abstract class Employees {
    
    protected String name; 
    protected String employeeID; 
    protected double baseSalary; 
    
       public Employees(String name, String employeeID, double baseSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
    }
    
       public abstract double calcComission(); 
  
}
