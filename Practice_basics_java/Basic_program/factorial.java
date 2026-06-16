package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class factorial {
       public static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
     }

     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        
        int fact=Factorial(n);
        System.out.println(fact);
        sc.close();
        
     }

}
