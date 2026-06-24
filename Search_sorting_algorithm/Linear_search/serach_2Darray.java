package Search_sorting_algorithm.Linear_search;

import java.util.Arrays;

public class serach_2Darray {
    public static void main(String[] args) {
        int [][] arr={
            {23,4,2},
            {636,77,53,99},
            {66,34,21,233,56}
        };
        int target =34;
        int [] ans=searchTwoDArray(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchTwoDArray(int[][] arr,int target){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}
