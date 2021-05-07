import java.io.*;

/**
 * * In this program we will perform addition on natural numbers in a given range. 
 * * So for this, we have to ask the user to enter two numbers which will denote the starting 
 * * and ending of the range for adding all natural numbers between that range.

 * ? For better understanding let’s suppose two values 3 and 8,

 * ! Then, Sum of all natural numbers between 3 and 8 will be (3+4+5+6+7+8) = 33.
 */

public class Sum_Given_Numbers {
    public static void main(String[] args)throws IOException {
       InputStreamReader IS = new InputStreamReader(System.in);
       BufferedReader ob = new BufferedReader(IS); 
       System.out.println("Enter minimum range:");
       int minRange = Integer.parseInt(ob.readLine());
       System.out.println("Enter maximumm range:");
       int maxRange = Integer.parseInt(ob.readLine());
       int sum = 0;
       System.out.print("Sum of ");
       for (int i = minRange; i < maxRange; i++) {

           System.out.print(i + " + ");
           if (i == (maxRange - 1)) {
               i++;
               System.out.print(i);
           }
       }

       for (int i = minRange; i <= maxRange; i++)
       {
           sum = sum+i;
       }
       System.out.println(" = "+sum);

    }
}
