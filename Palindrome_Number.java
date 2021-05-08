/**
 * $ In this article, we will create a java program to check whether a string entered by the user is Palindrome or not.
 * $  Here we will ask the user to enter a string and then by the help of the java code we will reverse the string 
 * $ and then check that the reversed string is equal to the original string or not. If the reversed string is equal 
 * $ to the original string then the string is Palindrome , otherwise the string is not Palindrome

 * $ For better understanding let’s consider some examples :

 * $ 1900 : 
 * $ Reverse of 1900 is 0091, but 0091 is not equal to 1900, hence the string is not Palindrome.
 */


import java.io.*;

public class Palindrome_Number {
    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: "); // Taking user input
        int number = Integer.parseInt(ob.readLine());
        int temp = number;
        int revNumber = 0;
        while (number !=0) {
            int remainder = number % 10;
            revNumber = revNumber * 10 + remainder; // Logic of reverse number
            number = number / 10;
        }
        if (temp == revNumber) {
            System.out.println("The number is a palindrome number");
        } else {
            
            System.out.println("The number is not a palindrome number");
        }
    }
}
