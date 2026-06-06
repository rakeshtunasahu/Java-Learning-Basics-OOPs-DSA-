package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class average {
     public static int findAverage(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        System.out.println("enter the third number: ");
        int c=sc.nextInt();

        int avg=findAverage(a, b, c);
        System.out.println("the average is "+ avg);
        sc.close();
    }
}
