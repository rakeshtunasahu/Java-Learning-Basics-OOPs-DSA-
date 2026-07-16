package Pattern_problems;

import java.util.Scanner;

public class number_pyramid {
     public static void main (String[] args){
        Scanner  sc = new Scanner(System.in);
    
        System.out.print("enter the rows: ");
        int n = sc.nextInt();
        System.out.print("enter the columns: ");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
        sc.close();   
    }
}
