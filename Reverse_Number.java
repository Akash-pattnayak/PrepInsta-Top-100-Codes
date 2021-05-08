import java.io.*;

public class Reverse_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int Number = Integer.parseInt(ob.readLine());
        System.out.print("The reversed number is :");
        // int revNumber =0;
        while (Number != 0) {
            int rem = Number % 10;
            // revNumber = revNumber * 1o +rem;
            System.out.print(" " +rem);
            Number = Number/10;

        }
        System.out.println(" ");
    }

}
/**
 * revNumber =0;
 *   Input :
 *      125
 *   while
 * {
 *     rem = 125%10 = 5;
 * 1 st loop: revNumber = 0*10+5=5
 * 2 nd loop: revNumber = 5*10+2=52
 * 3 rd loop: revNumber = 52*10+1=521
 * }
 */