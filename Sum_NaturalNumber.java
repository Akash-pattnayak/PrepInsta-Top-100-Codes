import java.io.*;


public class Sum_NaturalNumber {
  public static void main(String[] args)throws IOException {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      int sum = 0;
      int n;
      System.out.println("Enter the Vlaue of N:");
      n = Integer.parseInt(input.readLine());
      for (int i = 0; i <= n; i++) {
        sum = sum + i;
      }
      System.out.println("Sum of "+n +" Natural number is "+sum);
      
  }  
}
/*
  ?  1. Command Line Argument
  ?  2. Scanner class
  ?  3. BufferedReader

   * 1.Using Command Line Argument
   ---------------------------------
   int n1 = Integer.ParseInt(args[0])
   int n2 = Integer.ParseInt(args[1])

   2.Using Scanner Class
   ----------------------

   Done

   3. Using BufferedReader Class
   --------------------------------

   Method 1:

   * BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

   Method 2:

   ! InputStreamReader is = new InputStreamReader(System.in);
   ! BufferedRader ob = new BufferedReader(is);





*/