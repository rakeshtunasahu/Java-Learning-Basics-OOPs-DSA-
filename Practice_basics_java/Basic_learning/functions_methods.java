package Practice_basics_java.Basic_learning;
import java.util.Scanner;

public class functions_methods {
     public static void main(String[] args){
        int answer=sum();
        System.out.println(answer);

        String message=greet();
        System.out.println(message);
        
     }
     static int sum(){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number:");
        int first = sc.nextInt();
        System.out.println("enter the 2nd number:");
        int second= sc.nextInt();
        int sum = first +second;
         sc.close();
        return sum;
       
    }

    static String greet(){
        System.out.println("hello , how are u!");
        return greet();
    }
}
