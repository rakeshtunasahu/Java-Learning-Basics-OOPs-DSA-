public class binary_search_recursion {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,9,23};
        int target =3;
        int ans=search(arr, target, 0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int m=start+(end-start)/2;
        if(target == arr[m]){
            return m;
        }
        if(target <arr[m]){
           return  search(arr,target,start,end-1);
        }
        return search(arr, target, start+1, end);
    }
}
