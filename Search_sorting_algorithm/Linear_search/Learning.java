package Search_sorting_algorithm.Linear_search;
import java.util.*;
public class Learning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,6,8,4,2,33,44,54,22,89,99,76,712,3,6};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
