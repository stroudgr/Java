/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;


/**
 *
 * @author StroudFamily2013IMac
 */
public class Player extends JPanel implements ActionListener, KeyListener {

    
    Timer t = new Timer(5,this);
    
    double x =0,dx=0; 
    
    
    public Player(){
    t.start();
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    
    
    }
    @Override
    public void paintComponent (Graphics g){
    //super.paintComponents(g);
    Graphics2D g2 =(Graphics2D)g;
    g2.fill(new Rectangle.Double(x,800-20,40,20));
    
    
    }
    
    public void actionPerformed(ActionEvent e){
    repaint();
    x=+dx;
    }
    
    
    public void keyPressed(KeyEvent e){
    int input = e.getKeyCode();
    
    if (input == KeyEvent.VK_LEFT){
        dx--;
        x+=dx;
    }
        
    if (input == KeyEvent.VK_RIGHT){
        dx++;
        x+=dx; 
    }
        
    
    }
    
    public void keyReleased(KeyEvent e){
    int input = e.getKeyCode();
    
    }
    
    
    
    public void keyTyped(KeyEvent e){}
    
    
    
    
}

    
    
    
    
    
    

