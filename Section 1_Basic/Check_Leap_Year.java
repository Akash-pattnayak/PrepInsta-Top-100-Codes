import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int Year = sc.nextInt();
        if ((Year%4==0)&&(Year%100 !=0)|| Year%400==0) {
            System.out.println("This is a leap Year");
        } else {
            
            System.out.println("This is not a leap Year");
        }
        sc.close();
    }
}
