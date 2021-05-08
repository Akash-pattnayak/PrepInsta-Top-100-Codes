/**
 * #   In this program, we will create a java program to reverse a number. Here we will ask the user to 
 * # enter a number and then by the help of the java code we will reverse the number and display it on 
 * # the screen.
 
 * @ Reversing of a number generally means printing the number in reverse order. 

 * $ On most of the sites, the reverse of a number is done in wrong way because if you put 90, 100, 1300 and many 
 * $ other inputs which have ‘ 0 ’ in last digits of the number then it will neglect 0 in their output. So, below 
 * $ mentioned code is made after considering all the cases.
 */


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