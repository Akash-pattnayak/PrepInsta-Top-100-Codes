import java.io.*;

/**
 * Greatest_Three_Numbers
 */
public class Greatest_Three_Numbers {

    public static void main(String[] args) throws IOException {

        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader ob = new BufferedReader(IS);

        System.out.println("Enter First Number");
        int firstNumber = Integer.parseInt(ob.readLine());

        System.out.println("Enter Second Number");
        int secondNumber = Integer.parseInt(ob.readLine());

        System.out.println("Enter Third Number");
        int thirdNumber = Integer.parseInt(ob.readLine());
          if (firstNumber>secondNumber){ 
             
                if(firstNumber>thirdNumber)
              {
                   System.out.println(firstNumber+" is greatest number");
                 }
                  else
                 {
                    System.out.println(thirdNumber+" is greatest number");
                 }
             
             }
             else if(secondNumber>thirdNumber)
                  {
                    System.out.println(secondNumber+" is greatest number");
                  }
                  else {
                    System.out.println(thirdNumber+" is greatest number");
              }

        /**
         * ? let a,b,c
         *  if (a>b){ 
         *  
         *    if(a>c)
         *     {
         *       print: a is greatest number
         *     }
         *      else
         *     {
         *        print: c is greatest number
         *     }
         * 
         * }
         * else if(b>c)
         *      {
         *          print:b is greatest number
         *      }
         *      else {
         *          print:c is greatest number
         *  }
         *  */ 
        

    }

}
