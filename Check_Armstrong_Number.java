import java.io.*;

public class Check_Armstrong_Number {
    public static void main(String[] args)throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int inputNumber = Integer.parseInt(ob.readLine());
        int temp = inputNumber;
        int sum =0;
        while (inputNumber !=0) {
            int rem = inputNumber % 10;
            sum = sum + (rem*rem*rem);
            inputNumber = inputNumber/10;
        }
        if(sum == temp)
        {
            System.out.println("It is an Armstrong number.");
        }
        else
        {
            System.out.println("It is not an Armstrong number.");

        }
    }

}
