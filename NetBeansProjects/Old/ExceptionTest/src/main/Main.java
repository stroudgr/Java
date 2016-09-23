/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
/**
 *
 * @author StroudFamily2013IMac
 */
public class Main extends JPanel implements KeyListener,ActionListener{

    public static JFrame j; static Dimension size = new Dimension(800,600);
    public Timer t = new Timer(5,this);
    public static int x =10,y=10, dx=2, dy=2;
    
    Main(){
        setSize(400,300);
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
      
    }
    
    public static void start(){
        j = new JFrame();
        j.setVisible(true);
        j.setDefaultCloseOperation(3);
        j.setSize(size);
        j.setName("Game");
        j.setResizable(true);
        
        j.add(new Main());
    }
    
    public static void addNewComponent(Component c){
    
        j.add(c);
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        start();
    }

    @Override
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
        g.fillOval(x, y, 15, 15);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println(dx);
       
         if (x<0||x>size.width-15)
            dx*=-1;
    
         x+=dx;
        
        if (y<0||y>size.height-15)
            dy*=-1;
        
        y+=dy;
        
         
         
        repaint();
        
    }

    @Override
    public void keyPressed(KeyEvent e){
    System.out.println("SWAGBUCKS");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
