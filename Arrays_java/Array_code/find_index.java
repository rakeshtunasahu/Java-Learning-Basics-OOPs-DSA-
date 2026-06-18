package Arrays_java.Array_code;
import java.util.*;
public class find_index {
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
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("the index of the x is ("+ i + "," + j + ")");
                }else{
                    System.out.println("enter x is invalid pls re-enter the x");
                }
                 sc.close();
            }
        }
    }
       
    }

