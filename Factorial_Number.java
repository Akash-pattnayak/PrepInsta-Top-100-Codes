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
        System.out.print("Factorial of " + number + " is :");
        int Factorial = 1;
        for (int i = 2; i <= number; i++) {
            Factorial = Factorial * i;           
        }
        System.out.print(" " + Factorial);

    }
}