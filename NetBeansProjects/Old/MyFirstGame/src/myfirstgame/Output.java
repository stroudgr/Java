/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgame;
import javax.swing.*;


/**
 *
 * @author StroudFamily2013IMac
 */
public class Output extends JFrame {

    public Output(){
  
    add(new Third());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setTitle("My Game");
    setSize(600,400);
    setResizable(true);
    
    }
    
  
     
    
    public static void main (String[] args){

        new Output();

        
}
    
}
