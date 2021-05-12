import java.io.*;

/**
 * Factorial_Number
 */
public class Factorial_Number {

    public static void main(String[] args) throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(IS);
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(ob.readLine());
        System.out.println("Factorial of " + number + " is :");
        System.out.print(number+"!"+" =");
        int Factorial = 1;
        for (int i = 2; i <= number; i++) {
            Factorial = Factorial * i;           
        }
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                System.out.print(" "+i);
            } else {
                System.out.print(" "+i+" *");
            }
            
        }
        System.out.println(" = " + Factorial);
        System.out.println(" ");

    }
}