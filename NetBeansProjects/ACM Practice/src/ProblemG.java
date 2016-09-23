
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemG {
    
    
    public static void main(String args[]) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String output[] = new String[N];
        
        for (int i=0; i < N; i++){
            
            String[] input = br.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            String name = input[2];
            
            Brownie B = new Brownie(name, m, n);
            
            output[i]=B.getWins();
        
        }
        
        for (int j=0; j<N; j++){
        
            System.out.println(output[j]);
        
        }
        
    
    }
	
}