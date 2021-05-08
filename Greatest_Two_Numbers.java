import java.io.*;

/**
 * $ In this program we try to wite a code whivh can find the greatest of two numbers. 
 * $ We will ask the user to enter two numbers and
 * $ check which is greater. For this purpose, we use if-else ! statement to
 * $ compare both numbers.
 */
public class Greatest_Two_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first Number");
        int firstNumber = Integer.parseInt(ob.readLine());
        System.out.println("Enter Second Number");
        int secondNumber = Integer.parseInt(ob.readLine());
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);

        } else {
            System.out.println(secondNumber + " is greater than " + firstNumber);

        }

    }
}
