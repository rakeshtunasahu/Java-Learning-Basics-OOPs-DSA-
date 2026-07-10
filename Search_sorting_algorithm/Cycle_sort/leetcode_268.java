package Search_sorting_algorithm.Cycle_sort;

public class leetcode_268 {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Search for the missing index
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // If every index has the correct value
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}