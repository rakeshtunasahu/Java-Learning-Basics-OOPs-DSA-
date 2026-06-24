package Search_sorting_algorithm.Linear_search;

public class Search_in_range {
    public static void main(String[] args) {
        int[]arr={4,6,7,8,3,1,2,45,32,67};
        int target=8;
        int ans=SearchRange(arr, target, 0, 5);
        System.out.println(ans);
    }
    static int SearchRange(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i =start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}