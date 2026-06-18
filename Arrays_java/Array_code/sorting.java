package Arrays_java.Array_code;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array:");
  

        int numbers[]= new int[6];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        Arrays.sort(numbers);
         
        System.out.println("sorted array:"+ Arrays.toString(numbers));
        sc.close();
    }
    
}
