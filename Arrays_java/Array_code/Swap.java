package Arrays_java.Array_code;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 7, 3, 6, 3, 778, 33, 45, 22, 66};
        swap(arr, 1, 5);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}