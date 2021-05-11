import java.io.*;
/**
 * Check_FriendlyPair_Number
 */
public class Check_FriendlyPair_Number {

    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number:");
        int firstNumber = Integer.parseInt(ob.readLine());
        System.out.print("Enter second number:");
        int secondNumber = Integer.parseInt(ob.readLine());
        int sumFactors_firstNumber = 0;
        int sumFactors_secondtNumber = 0;
        for (int i = 1; i < firstNumber; i++) {
            if(firstNumber % i ==0){
                sumFactors_firstNumber = sumFactors_firstNumber + i;
            }
        }
        for (int j = 1; j < firstNumber; j++) {
            if(secondNumber % j ==0){
                sumFactors_secondtNumber = sumFactors_secondtNumber + j;
            } 
        }
        if ((sumFactors_firstNumber == secondNumber) && (sumFactors_secondtNumber == firstNumber)) {
            System.out.println("These numbers are Friendly pair numbers.");
        } else {
            System.out.println("These numbers are not Friendly pair numbers."); 
        }
    }
}