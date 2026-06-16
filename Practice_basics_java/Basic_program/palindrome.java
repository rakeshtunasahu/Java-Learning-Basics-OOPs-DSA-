package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class palindrome {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
      
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;        // get last digit
            reverse = reverse * 10 + digit;
            n = n / 10;                // remove last digit
        }

        if (original == reverse)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
        sc.close();
    }
}
