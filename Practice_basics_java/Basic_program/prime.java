package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class prime {
    public static int calculatePrime(int n){
        if(n%2==0){
            System.out.println("this is the prime number");
        }else{
            System.out.println("this is  not the prime number");
        }
        return n;
    }

    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();

        int prime=calculatePrime(n);
        System.out.println(prime);
        sc.close();
    }
}
