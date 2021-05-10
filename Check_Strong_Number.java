import java.io.*;

/**
 * Check_Strong_Number
 */
public class Check_Strong_Number {

    public static void main(String[] args) throws IOException {

        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(IS);

        System.out.println("Enter the number: ");
        int number = Integer.parseInt(ob.readLine());
        int temp = number;
        int sum = 0;
        while (number != 0) {
            int rem = number % 10;
            int fact = 1;
            for (int i = 2; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            number = number / 10;
        }

        if (sum == temp) {
            System.out.println("This is a strong number.");
        } else {
            System.out.println("This is not a strong number.");
        }
    }
}