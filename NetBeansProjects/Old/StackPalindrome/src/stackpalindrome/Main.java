/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stackpalindrome;

import java.util.*;

/**
 *
 * @author 309266302
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here

        //Variables
        //top represents first half of word, bottom represents second half
        Stack <Character> top = new Stack<Character>(); Stack bottom = new Stack();
	
        //user input for String
        Scanner in = new Scanner(System.in);
	String st = in.next();
        
        //sets first half of string to strTop, second half to strBotttom
	String strTop=st.substring(0,st.length()/2);
        String strBottom=st.substring(st.length()/2+1, st.length());

        //changes second half to add extra char for even length words
	if (st.length()%2==0)
	    strBottom=st.substring(st.length()/2, st.length());

	//System.out.println(strTop);
	//System.out.println(strBottom);

        //pushes first set of chars to stack
	for (int i=0; i<strTop.length();i++){
	    //System.out.println(strTop.charAt(i));
            top.push(strTop.charAt(i));
        }

        //pushes second set of chars to stack
	for (int i=strBottom.length()-1; i>=0;i--){
	    //System.out.println(strBottom.charAt(i));
            bottom.push(strBottom.charAt(i));
        }


	boolean flag = true;

        //searches stacks for differeniating chars
        //if stacks share identical values, then string is palindrome
        //else, it is not a palindrome
	for (int i=0; i<strTop.length();i++){
	    //System.out.println(top.peek()+ " " + bottom.peek());
            if (top.pop()!=bottom.pop()){   
		flag = false;
		break;
	    }
	}

	if (flag ==true)
	    System.out.println("The word inputted is a palindrome.");
	else
	    System.out.println("The word inputted is not a palindrome.");



    }

}
