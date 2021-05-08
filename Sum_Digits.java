import java.io.*;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Sum_Digits {

//     public static void main(String[] args) throws IOException {
//         BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a number: ");
//         int Number = Integer.parseInt(ob.readLine());
//         int result = 0;
//         int revNumber = 0;
//         System.out.print("Sum of :");
//         if (Number == 0) {
//             System.out.println("Number is zero.Sum of digits not possible");
//         } else {
//             while (Number != 0) {
//                 revNumber = revNumber * 10 + (Number % 10);
//                 Number = Number / 10;
//             }
//             while (revNumber != 0) {
//                 System.out.print(revNumber % 10);
//                 result = result + (revNumber % 10);
//                 revNumber = revNumber / 10;
//                 if (revNumber > 0) {
//                     System.out.print(" + ");
//                 }
//             }
//             System.out.println(" = " + result);
//         }
//     }
// }
// }

// public static void main(String[] args) {
// int number, result;
// Scanner ob = new Scanner(System.in);
// System.out.println("Enter number:");
// number = ob.nextInt();
// result = 0;
// System.out.print("The numbers: ");

// //Reverses the number
// int reversedNum = 0;
// while (number != 0) {
// reversedNum = reversedNum * 10 + number % 10;
// number = number / 10;
// }

// //Iterates over the number and prints it out
// while (reversedNum != 0) {
// System.out.print((reversedNum % 10));

// result = result + (reversedNum % 10);
// reversedNum = reversedNum / 10;

// if (reversedNum > 0) {
// System.out.print(" + ");
// }
// }
// System.out.println(" = " + result);
// ob.close();
// }
/**
 * Sum_Digits
 */
public class Sum_Digits {

    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int Number = Integer.parseInt(ob.readLine());
        int sum = 0;
        while (Number !=0) {
            sum = sum + Number%10;
            Number = Number/10;
        }
        System.out.println("Sum of Digits = "+ sum);
        
    }
}