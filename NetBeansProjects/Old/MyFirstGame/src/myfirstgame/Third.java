/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 *
 * @author StroudFamily2013IMac
 */
public class Third extends JPanel implements ActionListener,KeyListener {
    
    Timer t = new Timer(5,this);
    
    double x =0,dx=0; 
    String s="";
    double ox=0, oy=0, odx=1.5,ody=1.5;
    
    public Third(){
    //t.start();
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    System.out.println("Construcotr finshed");
    
    }
    
    @Override
    public void paintComponent (Graphics g){
        System.out.println("paintin'");
    super.paintComponents(g);
    Graphics2D g2 =(Graphics2D)g;
    g2.fill(new Rectangle.Double(x,360,60,20));
    
    
    g.drawString(s, 10, 100);
    
    Ellipse2D circle = new Ellipse2D.Double(ox,oy,40,40);
    g2.fill(circle);
    t.start();
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    //repaint();
    if (x<0)
        x+=Math.abs(dx);
    else if(x>560)
        x+=-Math.abs(dx);
    else
        x+=dx;
    
    //Second Class
    if (ox<0||ox>560)
        odx=-odx;
    if (oy<0||oy>360)
        ody=-ody;
    
    ox+=odx;
        oy+=ody;
        
       
        
        repaint();
    }
    
    
   
    @Override
    public void keyPressed(KeyEvent e){
        int input = e.getKeyCode();
    
    if (input == KeyEvent.VK_UP&&x>0)
        dx=-2;
    if (input == KeyEvent.VK_RIGHT&&x<560)
        dx=2;
    
    String st = Character.toString((char)input);
    
    if ((input>=65&&input<=90)||input==KeyEvent.VK_SPACE){
        s = s.concat(st);
    }
    else if(input==KeyEvent.VK_BACK_SPACE&& s.length()>0){
        s= s.substring(0, s.length()-1);
    }
    
    }
        
    @Override
    public void keyReleased(KeyEvent e){
    int input = e.getKeyCode();
     
    if (input == KeyEvent.VK_UP)
        dx=0;
    if (input == KeyEvent.VK_RIGHT)
        dx=0;
    
    
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e){}
    
    
    
    
}
