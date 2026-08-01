package Pattern_problems;

import java.util.*;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        System.out.print("Enter the columns: ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {      // Use n
            for (int j = 1; j <= m; j++) {  // Use m
                System.out.print("*");
            }
            System.out.println();           // Move to next line
        }

        sc.close();
    }
}
