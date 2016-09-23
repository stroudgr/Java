/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stick;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
/**
 *
 * @author StroudFamily2013IMac
 */
public class Stick extends StateBasedGame{

    //common variables
    public static String name = "Brick Breaker";
    public static final int menu =0;
    public static final int play =1;
    
    public Stick(String s){
        super(s);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
        
    }
   
    public static void main(String[] args) {
        
        AppGameContainer appgc;
        try{
            appgc = new AppGameContainer(new Stick(name));
            appgc.setDisplayMode(640, 360, false);
            appgc.start();
            
        }catch(SlickException e){
            e.printStackTrace();
        }
        
        
    }

    @Override
    public void initStatesList(GameContainer container) throws SlickException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.getState(menu).init(container, this);
        this.getState(play).init(container, this);
        this.enterState(menu);
        
        
    }
}
