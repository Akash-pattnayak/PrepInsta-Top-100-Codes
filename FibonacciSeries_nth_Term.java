import java.util.Scanner;

public class FibonacciSeries_nth_Term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: "); //User input for nth terms
        int term = sc.nextInt();
        int prev = 0;
        int current = 1;
        if (term > 1) {
            if (term == 2) {
                System.out.print("Fibonacci series upto " + term + "nd terms  are:");

            } else if (term == 3) {

                System.out.print("Fibonacci series upto " + term + "rd terms  are:");
            } else {

                System.out.print("Fibonacci series upto " + term + "th terms  are:");
            }
            for (int i = 1; i <= term; i++) {
                System.out.print(" " + prev); 
                int next = current + prev;  //Logic of fibonacci series: Next term is summation of previous two terms
                prev = current; // previous value will be current value, means current value is assigned to previous value
                current = next; //  current value will be next value, means next value is assigned to current value
            }
        } else {
            System.out.println("Wrong Input !! Try again");
            System.out.println("Term value can not be less than 2");
        }

        System.out.println(" ");
        sc.close();
    }
}
