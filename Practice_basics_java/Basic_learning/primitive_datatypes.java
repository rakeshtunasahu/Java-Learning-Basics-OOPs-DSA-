package Practice_basics_java.Basic_learning;

import java.util.Scanner;

public class primitive_datatypes {
    public static void main(String[]args){

        // int rollno=64;
        // char letter= 'r';
        // float marks = 98.56f;
        // double largeDecimalPoints = 8884.968;            //This are all primitives datatypes with example.
        // long largeInteger = 6634664899831L;
        // boolean check = true;

        // now taking the input from user for int datatypes.
        Scanner sc=new Scanner(System.in);
          System.out.println("enter your roll no:");
          int roll=sc.nextInt();
          System.out.println("your roll no is: "+ roll);

         

        sc.close();

     }
}
