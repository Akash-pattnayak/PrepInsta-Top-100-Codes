import java.util.*;

public class Check_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <=number; i++) {
            if(number%i==0)
            {
                count++;
            }
        }
        if(count ==2)
        {
            System.out.println(number+" is a prime number");
        }else{

        System.out.println(number+" is not a prime number");

        }
        sc.close();
    }
}
/**
 * 
 *  number : 5
 *  i =2
 * {
 *   5/2 ==0 (false)
 *  5/5 == 0(true)
 *  count =0+1= 1
 * }
 */
