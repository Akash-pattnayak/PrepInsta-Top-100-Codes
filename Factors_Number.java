import java.io.*;

public class Factors_Number {
    public static void main(String[] args)throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(IS);
        System.out.println("Enter a number:");
        int Number = Integer.parseInt(ob.readLine());
        int Divisor = 0 ;
         if (Number ==0) {
             System.out.println("Every Number is the factor of Zero");
         } else {
            //System.out.print("Factors of "+Number+" are:");
            for (int i = 1; i <= Number; i++) {
                if (Number % i == 0 ) {
                    Divisor++;
                    
                    //System.out.print(" "+ i);
                }
            }
            System.out.println("\nThere are "+Divisor + " factors of "+Number);
            System.out.print("\nThose are : ");
            for (int i = 1; i <= Number; i++) {
                if (Number % i == 0 ) {                
                    System.out.print(" "+ i);
                }
            }
            System.out.println(" ");
            
         }
        
    }
}
/**
 * ? If you want to print number of factors first and then factors then let it go because this code will print like this
 * ? But if you  want to print factors first then number of factors then uncomment the commented code
 * ? and comment the below code which is second for loop
 *  ! System.out.print("\nThose are : ");
 *  ! System.out.print("\nThose are : ");
 *  !     for (int i = 1; i <= Number; i++) {
 *  !         if (Number % i == 0 ) {                
 *  !             System.out.print(" "+ i);
 *  !         }
 *  !     }
 */