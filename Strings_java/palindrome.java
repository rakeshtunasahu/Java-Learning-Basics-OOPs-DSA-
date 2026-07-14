package Strings_java;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }

        sc.close();
    }
}