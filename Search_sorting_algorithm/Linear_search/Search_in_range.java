package Search_sorting_algorithm.Linear_search;
import java.util.*;
public class Search_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 6, 8, 4, 2, 33, 44, 54, 22};
        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();
        int ans = searchInRange(arr, target, 2, 6);
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(target + " found at index " + ans);
        }

        sc.close();
    }
    static int searchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}