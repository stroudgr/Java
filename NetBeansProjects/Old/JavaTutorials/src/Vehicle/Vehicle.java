/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;



/**
 *
 * @author StroudFamily2013IMac
 */
public class Vehicle{
    
    public static double importantNum = 3.1459;
    public int wheels=0;
    public boolean highwayAccessible= false;
    public String colour = "none";

public void changeColor(String c){
    colour =c;
}

public void details(){
System.out.println("The vehicle is " + highway() +", has " + wheels + " wheels, and is the color " + colour);


}

public String highway(){
    if (highwayAccessible==false)
        return "not highway accessible";
    
return "highway accessible";
}

public static void main (String [] args){

Vehicle v = new Vehicle();
v.changeColor("green");
v.details();

Bike b = new Bike();
b.colour = "swag";
b.details();

Vehicle c = new Car();

c.details();

System.out.println(importantNum);
   
}



}


