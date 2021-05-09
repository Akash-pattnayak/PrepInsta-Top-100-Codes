 /**
  * ! In this program  we will create a java program to find all armstrong numbers between two intervals. 
  * ! For this purpose we will ask the user to enter starting range and ending range so that all armstrong 
  * ! numbers between this range can be find and an armstrong number of three digits is the number whose sum 
  * ! of the cubes of its digits is equal to the given number or can say the number itself should be the result.

  * ! Let us consider an example for understanding armstrong number in a better way.

  * @ Example :

   * % Suppose a number is 407 ;
   * % Cubes of its digits are :
   * %    Cube of 4 = 64 ;

   * %    Cube of 0 = 0 ;

   * %    Cube of 7 =  343 ;

 * $ Sum of all digit’s cube : 64 + 0 + 343 =407
 * $ Here the calculated result is equal to the given number ;

 * $ So, 407 is an Armstrong Number. 
  */
 
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
             int loopVariable = i;
             while (loopVariable != 0) {
                 int remainder = loopVariable % 10;
                 sum = sum + (remainder * remainder * remainder);
                 loopVariable = loopVariable / 10;
             }
             if (sum == temp) {
                 System.out.print(" " + i);
             }

         }
         System.out.println(" ");
     }
 }