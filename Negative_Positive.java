import java.util.Scanner;

/**
 * Negative_Positive
 */
public class Negative_Positive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("The entered number is a Positive number");
            
         }else{
            System.out.println("The entered number is a Negative number");
        }
        sc.close();
    }
}