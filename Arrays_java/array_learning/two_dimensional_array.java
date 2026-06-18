package Arrays_java.array_learning;

import java.util.Scanner;

public class two_dimensional_array {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the number of cols: ");
        int cols=sc.nextInt();

        int numbers[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("the matrix is : " + numbers[i][j]+ " ");
            }
            System.out.println();
        }
       sc.close();

    }
}
