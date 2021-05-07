
/**
 * * In this program we will create a java program to find all prime numbers between the given range.
 * *For this purpose we will ask the user to enter starting range and ending range so that all prime 
 * *numbers between this range can be find and prime number are the whole numbers which have two factors 
 * *i.e. 1 and the number by itself. Some of the facts for the prime numbers are given below :-

 * ! 1.0 and 1 are not considered as prime number.
 * ! 2.Except for 0 and 1, a number is either a prime number or a composite number.
 * ! 3.Numbers that have more than two factors are called composite numbers.
 * ! 4.The  1 is neither prime nor composite.
 * ! 5.Except 2, all other even numbers are not prime.
 */

import java.util.Scanner;

public class Prime_Range_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum range:");
        int minRange = sc.nextInt();
        System.out.println("Enter maximum range:");

        int maxRange = sc.nextInt();
        System.out.print("prime numbers are:");
        int count;
        for (int i = minRange; i <= maxRange; i++) {
            count = 0; // With each incrementation of i,the value of count will get initilize with 0
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(" " + i);
                // System.out.println( " ");
            }

        }
        sc.close();
    }

}
/*
 * minRange =5 maxRange = 15
 * 
 * i = 5 { i%j ==0 5%1 == 0(true) count = 1 }
 */
