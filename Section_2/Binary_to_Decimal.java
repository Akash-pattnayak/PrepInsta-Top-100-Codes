import java.util.*;
/**
 * ! In this java program we convert a binary number to its decimal form. 
 * ! For this purpose we need to ask a binary number from user and convert that binary number to its decimal 
 * ! equivalent form and then print the converted number on to the screen.
 * 
 * % For conversion, we multiply each digit of binary number from right with power of 2 and adding 
 * % each multiplication result. The power starts from 0 and goes to p-1, where p is the total number 
 * % of digits in binary number. For better understanding with an example just have a look towards the
 * % below example
 * 
 * $ Let the number be 10110
 * $ So it's decimal equivalent will be as follow:
 * $  0 * (2^0) = 0*0 =  0
 * $  1 * (2^1) = 1*2 =  2
 * $  1 * (2^2) = 1*4 =  4
 * $  0 * (2^3) = 0*6 =  0
 * $  1 * (2^4) = 1*16 = 16
 * 
 * * So the Decimal equivalent = 0+2+4+0+16 = 22
 * 
 */
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
        int rem_temp = 0;
        int temp_1 = Number;
        // int rem_temp = 0;
        if (Number == temp) {
            while (temp_1 != 0) {
                 rem_temp = temp_1 % 10;
                numberOfDigits++;
                temp_1 = temp_1 / 10;
            }
        }
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
