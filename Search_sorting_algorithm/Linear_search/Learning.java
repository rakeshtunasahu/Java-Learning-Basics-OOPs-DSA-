package Search_sorting_algorithm.Linear_search;
import java.util.*;
public class Learning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 45, 33, 22, 756, 12, 23, 34, 56, 9, 7};
        int target = 34;
        int ans = LinearSearch(arr, target);

        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
            sc.close();
    }
    static int LinearSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
