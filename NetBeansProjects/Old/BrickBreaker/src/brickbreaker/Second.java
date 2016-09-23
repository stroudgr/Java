
package brickbreaker;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;


public class Second extends JPanel implements ActionListener{
    
    Timer t = new Timer(5,this);
    public static double ox=0, oy=0, odx=2,ody=2;
    
    public void paintComponent(Graphics g){
        //super.paintComponents(g);
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D circle = new Ellipse2D.Double(ox,oy,40,40);
        g2.fill(circle);
        //t.start();
    }
    
    
    public void actionPerformed(ActionEvent e){
    if (ox<0||ox>560)
        odx=-odx;
    if (oy<0||oy>360)
        ody=-ody;
    
        ox+=odx;
        oy+=ody;
        repaint();
    
    }
    
}