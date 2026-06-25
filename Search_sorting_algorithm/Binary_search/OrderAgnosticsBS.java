package Search_sorting_algorithm.Binary_search;
public class OrderAgnosticsBS{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,12,17,34,67,89,99};
        int target = 89;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
               }
            }
        }
        return -1;
    }
}