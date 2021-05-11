import java.io.*;

/**
 * Check_Automorphic_Number
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
            System.out.println("Success");
        }else{
            System.out.println("Fail");
        }
        
    }
}