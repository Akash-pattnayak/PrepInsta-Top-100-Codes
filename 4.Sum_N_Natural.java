import java.io.*;

public class Sum_N_Natural {
    public static void main(String[] args)throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(IS);
        int sum = 0;
      int Number;

      System.out.println("Enter the Vlaue of N:");
      Number = Integer.parseInt(ob.readLine());
      System.out.print("sum of ");
      for (int i = 1; i < Number; i++) {
        
        System.out.print(i+"+");

        if(i == (Number -1))
        {
          i++;
          System.out.print(i);
        } 
      }
      for (int i = 1; i <= Number; i++) {
        sum = sum + i;
      }
      System.out.println("= "+sum);
      
  }  
    }

