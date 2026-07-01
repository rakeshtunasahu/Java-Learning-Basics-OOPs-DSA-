package Search_sorting_algorithm.Bubble_sorting;
import java.util.*;
public class learning {
    public static void main(String[] args) {
        int [] arr={5,8,9,2,3,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Bubble(int []arr){
        boolean swapped;
        for(int i =0;i<arr.length;i++){
            swapped=false;
            for(int j =0;j<arr.length-i;j++){
                if(arr[j]>arr[j-1]){
                    int temp =arr[j];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
