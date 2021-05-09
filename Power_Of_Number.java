import java.util.*;

public class Power_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Enter value of power:");
        int power = sc.nextInt();
        int result = 1;
        for (int i = power; i > 0 ; i--) {

            result = result * number;
        }
        if (power == 1) {
            
            System.out.println(power + " time "+ number +" = "+ result);
        } else {
            
            System.out.println(power + " times "+ number +" = "+ result);
        }
        sc.close();
    }
    
}
