package Pattern_problems;
import java.util.*;
public class rectangle {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
    
        System.out.print("enter the rows: ");
        int n= sc.nextInt();
        System.out.print("enter the columns: ");
        int m= sc.nextInt();

        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}
