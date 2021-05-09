import java.util.Scanner;

public class FibonacciSeries_nth_Term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: ");
        int term = sc.nextInt();
        int prev = 0;
        int current = 1;
        if (term == 2) {
            System.out.print("Fibonacci series upto "+ term +"nd terms  are:");
            
        } else if (term == 3) {
            
            System.out.print("Fibonacci series upto "+ term +"rd terms  are:");
        } else{
            
            System.out.print("Fibonacci series upto "+ term +"th terms  are:");
        }
        for (int i = 1; i <= term ; i++) {
           System.out.print(" " +prev);
           int next = current + prev;
           prev = current;
           current =  next;
        }
        System.out.println(" ");
        sc.close();
    }
}
