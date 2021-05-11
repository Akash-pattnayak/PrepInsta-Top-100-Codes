import java.io.*;
/**
 * ! Friendly Pair are two natural numbers whose sum of factors of first number and sum of factors of second number 
 * ! is equal to second number and first number respectively.

 * ! In other words, Sum of factors of first number is equal to the second number and Sum of factors of second number 
 * ! is equal to the first number.

 * ! For better understanding let us consider an example.
 * * Suppose two numbers 220 and 284.
 * * Factors of both numbers :
 * %    – Factors of 220 = 1 , 2 , 4 , 5 , 10 , 11 , 20 , 22 , 44 , 55 and 110 ;

 * %    – Factors of 284 = 1 , 2 , 4 , 71 and 142.
 * * Sum of factors of both numbers :
 *  !  – Sum of factors of 220 =

 *  !             1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

 *  ! – Sum of factors of 284 =
 *  !              1 + 2 + 4 + 71 + 142 = 220  
 *  * Here we see that Sum of factors of first number is equal to the second number and Sum of factors of second 
 *  * number is equal to the first number. Hence, these both numbers are Friendly Pair to each other.             
 * 
 */
public class Check_FriendlyPair_Number {
    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number:");
        int firstNumber = Integer.parseInt(ob.readLine());
        System.out.print("Enter second number:");
        int secondNumber = Integer.parseInt(ob.readLine());
        int sumFactors_firstNumber = 0;
        int sumFactors_secondNumber = 0;
        for (int i = 1; i < firstNumber; i++) {
            if(firstNumber % i ==0){
                sumFactors_firstNumber = sumFactors_firstNumber + i;
            }
        }
        for (int j = 1; j < firstNumber; j++) {
            if(secondNumber % j ==0){
                sumFactors_secondNumber = sumFactors_secondNumber + j;
            } 
        }
        if ((sumFactors_firstNumber == secondNumber) && (sumFactors_secondNumber == firstNumber)) {
            System.out.println("These numbers are Friendly pair numbers.");
        } else {
            System.out.println("These numbers are not Friendly pair numbers."); 
        }
    }
}