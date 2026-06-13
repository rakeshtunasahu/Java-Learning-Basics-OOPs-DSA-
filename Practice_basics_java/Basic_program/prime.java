package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 2;
        int flag = 0;   // 0 → prime, 1 → not prime8

        if (n <= 1) {
            flag = 1;
        } else {
            while (i <= n - 1) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
                i++;
            }
        }

        if (flag == 0) {
            System.out.println("It is a PRIME number");
        } else {
            System.out.println("It is NOT a prime number");
        }
        sc.close();
    }
}
