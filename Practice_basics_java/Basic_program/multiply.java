package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class multiply {
    public static int calculateMultiplication(int a,int b){
        int mul=a*b;
        return mul;
    }
     public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        int mul=calculateMultiplication(a,b);
        System.out.println("the valuse is "+mul);
        sc.close();
     }
}
