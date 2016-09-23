/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.util.LinkedList;
/**
 *
 * @author 309266302
 */
public class Stack{

    //fields
    public static LinkedList list = new LinkedList();
    

    /**
     * A method that returns the size of a stack
     * @return      the size as an integer
     */
    public int size(){
        return list.size();
    }

    /**
     * A method that adds an object to the top of a stack
     * @param o     the object that is being added to the top
     */
    public void push(Object o){
        list.addLast(o);
    
    }
    /**
     * A method that checks the formatting of the elements of a stack, to see if the brackets in it are properly formatted
     * i.e. (){[]} is true, ([}) is false
     * @return true if brackets are grammatically correct, false if not
     */
    public boolean bracketMatch(){

        //Stores unpaired, open brackets
        LinkedList l = new LinkedList();
        
        //goes through each element of the stack and finds open or close bracket
        //runs through for loop as many times as the length of the Stack
        for (int i=0; i<size();i++){
         
            
            //if open bracket is found, it is added to a linkedlist
            if ((list.get(i).toString().equals("{"))||(list.get(i).toString().equals("["))||(list.get(i).toString().equals("(")))
                l.add(list.get(i).toString());
            
            //if close bracket is found, it will have to be paired with most recent open bracket
            if ((list.get(i).toString().equals("}"))||(list.get(i).toString().equals(")"))||(list.get(i).toString().equals("]"))){
               
                //checks if both the most recent element of linkedlist l and current element are matching brackets 
                //!= can be changed to ^ (aka XOR). One has to be true for if statement to be true, both true of false makes if statement false
                if((list.get(i).toString().equals("}"))!=(l.getLast().toString().equals("{")))
                    return false;
                if((list.get(i).toString().equals("("))!=(l.getLast().toString().equals(")")))
                    return false;
                if((list.get(i).toString().equals("["))!=(l.getLast().toString().equals("]")))
                    return false;
                
                //removes open bracket when it finds its pair
                l.removeLast();
            }
        }
        
        //if there are any unpaired brackets, then the brackets are incorrect
        if (l.size()!=0)
            return false;
        //unless other return statements are triggered, true is returned
        return true;

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack s = new Stack();
        
        String str ="{([(){}[]])}{}" ;
        
        for (int i=0; i<str.length();i++)
            s.push(str.charAt(i));
        
        System.out.println(s.bracketMatch());
       

    }

    
    
}
