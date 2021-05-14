import java.io.*;
/**
 * ! Automorphic number is a number whose square ends in the same digits as the number itself. 

 * ! For better understanding lets consider an example :
 * $     Suppose a number 5.
 * $     Square of 5 is 25.
 * $    and we see that 25 ends in the same digit as the number itself, means 5.

 * % Hence we can conclude that 5 is an Automorphic Number.

 * % Some more Automorphic Numbers are : 5 , 6 , 76 , 376 
 * % and 890625.

 */
public class Check_Automorphic_Number {

    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int Number = Integer.parseInt(ob.readLine());
        int Square = Number * Number;
        int rev_Square =0;
        int rev_Number =0;
        while (Square>= Number && Number !=0) {
            int rem_Square = Square % 10;
            rev_Square = rev_Square * 10 + rem_Square;
            int rem_Number = Number % 10;
            rev_Number = rev_Number * 10 + rem_Number;
            Square = Square/10;
            Number = Number / 10; 
        }
        if (rev_Square == rev_Number) {
            System.out.println("This is an automorphic number.");
        }else{
            System.out.println("This is not an automorphic number");
        }
        
    }
}