package Search_sorting_algorithm.Linear_search;

public class find_minimum {
    public static void main(String[] args) {
       int[]arr={44,56,21,23,34,56,76,99,51};
       System.out.println(findMinimum(arr)); 
    }
    static int findMinimum(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
