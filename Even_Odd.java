import java.io.*;

public class Even_Odd {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(is);
        int rem;
        System.out.println("Enter a number:");
        int Number = Integer.parseInt(ob.readLine());
        rem = Number / 2;
        if (rem * 2 == Number) {
            System.out.println("The entered number is an even Number");
        } else {
            System.out.println("The entered number is an odd Number");
        }
    }
}
