import java.util.*;

/**
 *!  LCM is a Least Common Multiple, means LCM of two numbers is the number which is the smallest 
 *!  common multiple of both numbers. It is also referred to as the Lowest Common Multiple(LCM) 
 *!  or Least Common Denominator(LCD).

 *%  Or, the LCM of two numbers is the smallest number which can be divided by both numbers.
 *%  For better understanding, let’s consider an example : –

* * Let’s say two numbers are 3 and 5, then
* * 
* * Multiples of 3 are 3, 6, 9, 12, 15, 18, 21 …
* * Multiples of 5 are 5, 10, 15, 20, 25, 30, 35 …

* $ So, the lowest common multiple of 3 and 5 is 15, which is the LCM  of both numbers.

* $ Here, we will create a java program to calculate the LCM of two numbers, 
* $ and the numbers will be taken as input from the user.
 */
public class LCM_Two_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();
        findLCM(firstNumber,secondNumber);
        sc.close();
       
    }
    public static void  findLCM(int number_1,int number_2)
    {
        int i;
        for (i = 1; i <= number_1 *number_2; i++) {
            if (i % number_1 == 0 && i % number_2 == 0) {
                break;
            }
        }
        System.out.println("LCM of " + number_1 + " and " + number_2 + " is " + i);
        
    }
}