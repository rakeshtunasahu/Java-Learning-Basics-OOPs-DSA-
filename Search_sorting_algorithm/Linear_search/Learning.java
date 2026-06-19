package Search_sorting_algorithm.Linear_search;
import java.util.*;
public class Learning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,5,6,8,4,2,33,44,54,22,89,99,76,712,3,6};
        System.out.println(Arrays.toString(arr));

    int numbers[]=new int[100];
        for(int i = 0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==i);
            System.out.println(x +"this is the element");
        }

        sc.close();
    }
}
