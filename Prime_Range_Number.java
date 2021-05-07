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
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print( " "+i);
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
