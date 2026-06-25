package Search_sorting_algorithm.Binary_search;

public class learning {
    public static void main(String[] args) {
         int [] arr={1,3,5,6,7,9,12,17,34,67,89,99};
         int target =89;
         int ans=binarySearch(arr, target);
         System.out.println(target +" is found in "+ans+"th index");
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        
            if(target<arr[mid]){
                end=mid-1;
            }else if (target > arr[mid]){
                start=mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
  
}
