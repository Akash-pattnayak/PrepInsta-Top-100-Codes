import java.io.*;

/**
 * ! GCD(Greatest Common Divisor) or HCF(Highest Common Factor) of two numbers is the number which
 * ! is the largest common factor of both numbers.It is also referred as Greatest Common Factor
 * ! (GCF), Greatest Common Measure(GCM), Highest Common Divisor(HCD)

 * ! Or, we can say that GCD or HCF of two numbers is the largest number that divides both the 
 * ! numbers.For better understanding let’s consider an example : –
 * 
 * * For example let’s consider two numbers 15 and 35, then

 * * Factors of 15 are 1, 3, 5 and 15

 * * Factors of 35 are 1, 5, 7 and 35

 * * Highest Common factor of 15 and 35 is 5, which is the result of HCF.
 
 * % So, now we will create a java program to calculate hcf or gcd of two numbers 
 * % with the help of a loop and nested if-else statements.
 */
public class HCF_Two_Numbers {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(ob.readLine());
        System.out.println("Enter second number:");
        int secondNumber = Integer.parseInt(ob.readLine());
        int i;
        int factors = 0;
        int max = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        for (i = 1; i <= max; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                if (i > factors) {
                    factors = i;

                }
            }
        }
        System.out.println("HCF of " + firstNumber + " and " + secondNumber + " is " + factors);
    }
}