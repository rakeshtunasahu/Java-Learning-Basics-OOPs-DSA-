package Arrays_java.array_learning;

import java.util.*;

public class array_in_function {
    public static void main(String[] args) {
        int[] nums = {2,4,34,32,66,77,33,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[3]=76;
    }
}
