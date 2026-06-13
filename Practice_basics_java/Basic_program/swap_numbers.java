package Practice_basics_java.Basic_program;
import java.util.*;

public class swap_numbers {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();

        swap(a, b);

        sc.close();
    }
}