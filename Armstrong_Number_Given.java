 import java.io.*;

 public class Armstrong_Number_Given {
     public static void main(String[] args) throws IOException {
         BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter minimum range:");
         int minRange = Integer.parseInt(ob.readLine());
         System.out.println("Enter maximum range:");
         int maxRange = Integer.parseInt(ob.readLine());
         System.out.print("Armstrong number between " + minRange + " and " + maxRange + " are:");
         for (int i = minRange; i <= maxRange; i++) {
             int sum = 0;
             int temp = i;
             int n = i;
             while (n != 0) {
                 int remainder = n % 10;
                 sum = sum + (remainder * remainder * remainder);
                 n = n / 10;
             }
             if (sum == temp) {
                 System.out.print(" " + i);
             }

         }
         System.out.println(" ");
     }
 }