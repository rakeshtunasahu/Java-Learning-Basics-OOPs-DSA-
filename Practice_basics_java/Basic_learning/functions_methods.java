package Practice_basics_java.Basic_learning;
import java.util.Scanner;

public class functions_methods {

    public static void main(String[] args) {

        int answer = sum();
        System.out.println(answer);

        String message = greet();
        System.out.println(message);

        greeting("Rakesh");
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int second = sc.nextInt();
        sc.close();
        return first + second;
    }

    static String greet() {
        return "Hello, how are you!";
    }

    static void greeting(String naam) {
        System.out.println("Hello " + naam);
    }
}
