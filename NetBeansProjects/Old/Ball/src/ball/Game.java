/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author StroudFamily2013IMac
 */
public class Game extends JFrame{

    
    Game(){
        add(new Ball());
        setVisible(true);
        setTitle("My Game");
        setBackground(Color.GREEN);
        setResizable(false);
        setSize(1600,1200);
        
    
    }
    
    
    public static void main (String args[]){
        Game g =new Game();
        Scanner in = new Scanner (System.in);
        
        Ball.addIn(in.nextInt());
    }

    

    
}
