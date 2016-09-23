/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graemestroudculminating;

import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

/**
 *
 * @author StroudFamily2013IMac
 */
public class BrickBreaker extends JFrame {

    public BrickBreaker(){
  
        
        
    add(new Second());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setTitle("My Game");
    setSize(600,400);
    setResizable(true);
    
    
    }
    
    
    public static void main (String[] args){

        new BrickBreaker();

        
}
    
}
    