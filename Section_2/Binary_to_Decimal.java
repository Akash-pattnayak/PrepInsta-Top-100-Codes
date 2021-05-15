import java.util.*;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binaryNumber = sc.nextInt();
        binaryToDecimal(binaryNumber);
        sc.close();

    }

    public static void binaryToDecimal(int Number) {
        int numberOfDigits = 0;
        int DecimalNumber = 0;
        int temp = Number;

        int temp_1 = Number;
        // int rem_temp = 0;
        if (Number == temp) {
            while (temp_1 != 0) {
                int rem_temp = temp_1 % 10;
                numberOfDigits++;
                temp_1 = temp_1 / 10;
            }
        }

        // int temp_numberOfDigits = numberOfDigits;
        int result = 1;
        for (int i = 0; i < numberOfDigits; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result = result * 2;
            }
            if (Number > 0) {

                int rem = Number % 10;
                DecimalNumber = DecimalNumber + (rem * result);
                Number = Number / 10;

            }
        }
        System.out.println("Decimal value of " + temp + " is " + DecimalNumber);
    }
}
