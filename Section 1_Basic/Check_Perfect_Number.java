import java.util.*;

public class Check_Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = sc.nextInt();
        int sum = 0;
        int temp = Number;
        for (int i = 1; i < Number; i++) {
            if (Number % i == 0) {
                sum = sum + i;
            }

        }
        if (temp == sum) {
            System.out.println("The entered number is a perfect number.");
        } else {
            System.out.println("The entered number is not a perfect number.");
        }
        sc.close();
    }
}
