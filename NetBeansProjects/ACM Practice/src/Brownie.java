
import java.util.LinkedList;

public class Brownie{

    public int m;
    public int n;
    public String person;
    /**
     * 
     * @param person
     * @param m is the number of "columns" 
     * @param n
     */
    public Brownie(String person, int m, int n){
        this.m = m;
        this.n = n;
        this.person = person;
    }
    /**
     * Returns outcomes for cutting mxn brownie horizontally
     * @return 
     */
    public LinkedList<Brownie[]> cutHorizontal(){

        LinkedList<Brownie[]> outcomes = new LinkedList();

        //make a 1xn piece +(m-1)xn piece, 2xn,...,(m/2)xn
        for (int i=1; i<= m/2; i++){
            //A pair of Brownie (two pieces)
            Brownie B[]= {new Brownie("Vicky",i,n),new Brownie("Vicky",m-i,n)};
            //System.out.println("H" + String.valueOf(m-i) + ", " + String.valueOf(i) + "    " + String.valueOf(n));
            outcomes.add(B);
        }
        return outcomes;

    }
    /**
     * Returns outcomes for cutting mxn brownie horizontally
     * @return 
     */
    public LinkedList<Brownie[]> cutVertical(){

        LinkedList<Brownie[]> outcomes = new LinkedList();

        //make a mx1 piece and a mx(n-1) piece, mx2 and mx(n-2),...,mx(m/2) and mx(n-m/2)
        for (int i=1; i<= n/2; i++){
            //A pair of Brownie (two pieces)
            Brownie B[]= {new Brownie("Harry",m,i),new Brownie("Harry",m,n-i)};
            outcomes.add(B);
            //System.out.println("H" + String.valueOf(m) + " " + String.valueOf(i) + ", " + String.valueOf(n-i));
        }
        return outcomes;

    }
    /**
     * Returns whether the person specified can win.
     */
    public String getWins(){

        //Base case is when the length or height is one for the player
        //if 
        //Otherwise

        //get set of possible cuts

        if (person.equals("Harry")){
            LinkedList<Brownie[]> outcomes = this.cutHorizontal();				
            //for each outcome:
            while (!outcomes.isEmpty()){
                Brownie[] current = outcomes.pop();
                Brownie b1 = current[0]; Brownie b2 = current[1];
                String s1 = b1.getWins(), s2 = b2.getWins();
                //Case when 
                if (s1.equals("Vicky cannot win") && s2.equals("Vicky cannot win")){
                    //He must win
                    //System.out.println("H can win");
                    return "Harry can win";
                }


            }
            return "Harry cannot win";
        }

        else{
            LinkedList<Brownie[]> outcomes = this.cutVertical();				
            //for each outcome:
            while (!outcomes.isEmpty()){
                Brownie[] current = outcomes.pop();
                Brownie b1 = current[0]; Brownie b2 = current[1];
                String s1 = b1.getWins(), s2 = b2.getWins();
                //Case when 
                if (s1.equals("Harry cannot win") && s2.equals("Harry cannot win")){
                    //He must win
                    //System.out.println("V can win");
                    return "Vicky can win";
                }


            }
            return "Vicky cannot win";
        }



    }
}