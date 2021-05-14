import java.io.*;

/**
 * Check_Harshad_Number
 */
public class Check_Harshad_Number {

    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int Number = Integer.parseInt(ob.readLine());
        int temp = Number;
        int sum = 0;
        while (Number !=0) {
                int remainder = Number % 10;
                sum = sum + remainder;
                Number = Number/10;
        }
        if (temp % sum ==0) {
            System.out.println("This is a Harshad number.");
        } else {
            System.out.println("This is  not a Harshad number.");
            
        }
    }
}