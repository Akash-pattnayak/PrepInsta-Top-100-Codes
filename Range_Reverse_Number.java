/**
 * In this program we try to print the palindrome number within a given range
 */

import java.io.*;

public class Range_Reverse_Number {
    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the minrange:");
        int minRange = Integer.parseInt(ob.readLine());
        System.out.println("Enter the maxrange:");
        int maxRange = Integer.parseInt(ob.readLine());

        for (int i = minRange;i <= maxRange ; i++) {
            int revNumber = 0;
            int temp = i;
            int n = i;
            while (n!=0) {
                int remainder = n % 10;
                revNumber = revNumber*10+remainder;
                n = n/10;
            }
            if (revNumber == temp) {
                System.out.println(" "+ temp);
            }
        }
    }
}
                // @ if we will use i in while loop then the value of i will change.
                // @ and i will becom 0 which will create error in for loop,because i should be minRange and after 
                // @ execution of while loop i would be minRange+1 but due to while loop i becomes 0
                // @ So to avoid this error we can use another variable to store the value of i which will not impact on value
                // @ the value of i.