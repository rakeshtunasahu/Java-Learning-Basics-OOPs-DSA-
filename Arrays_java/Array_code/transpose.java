package Arrays_java.Array_code;

import java.util.Scanner;

public class transpose {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int numbers[][] = new int[n][m];

        // input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // print transpose
        System.out.println("Transpose is:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
