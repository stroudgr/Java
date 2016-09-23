/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author StroudFamily2013IMac
 */
public class Bike extends Vehicle {
    public static double importantNum= 2.00;
    
    public String type;
    public Bike(){ 
        wheels =2;
        highwayAccessible = false;
    }
    
    public Bike(String a){ 
        wheels =2;
        highwayAccessible = false;
        type=a;
        
    }
    
    
    
    
    
}
