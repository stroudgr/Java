/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author StroudFamily2013IMac
 */
public class Ball extends JPanel implements ActionListener{

    Timer t = new Timer(5,this);
    public static int xM=0 , yM=0, dx=2, dy=2;
    public static int size =10;
    public static int a = 560;
    
    public Ball(){
    t.start();
    
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    }
    
    
    @Override
    public void paintComponent(Graphics g){
    
    super.paintComponents(g);
    g.setColor(Color.red);
    g.fillRect(xM, yM, size, size);
    t.start();
    
    }
    
    public static void addIn(int i){
    a+=i;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        repaint();
        /*
        if (xM>1600-size||xM<0)
            dx*=-1;
        if (yM>1200-size||yM<0)
            dy*=-1;
        */
        
        if (xM<a){
        xM+=dx;
        }
        if (xM>=a && yM<a)
            yM+=dy;
        
        repaint();
        
        
    }

   
    
    
    
}
