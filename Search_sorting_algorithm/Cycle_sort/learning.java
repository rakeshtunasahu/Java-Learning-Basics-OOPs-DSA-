package Search_sorting_algorithm.Cycle_sort;

import java.util.Arrays;

public class learning {
    public static void main(String[] args) {
        int[]arr={7,3,8,2,1,5,4,6};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void cyclesort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;        
    }
}
