package Arrays_java.Array_code;

public class maximum {
    public static void main(String[] args) {
        int [] arr={44,23,66,33,59,99,666,757,22,44,1,4};
        System.out.println("maximum value is " + max(arr));

    }
    static int max(int[] arr){
        int maxval =arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
} 