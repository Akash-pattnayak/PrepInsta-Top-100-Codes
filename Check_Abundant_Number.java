import java.io.*;

/**
 * Check_Abundant_Number
 */
public class Check_Abundant_Number {

    public static void main(String[] args)throws IOException {
        System.out.println("Enter a number:");
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.parseInt(ob.readLine());
        int sum = 0;
        for (int i = 1; i <Number; i++) {
           if (Number % i == 0) {
               sum = sum + i;
           } 
        }
        if (sum > Number) {
            System.out.println("This is an abundant number.");
        } else {
            System.out.println("This is not an abundant number.");  
        }
    }
}