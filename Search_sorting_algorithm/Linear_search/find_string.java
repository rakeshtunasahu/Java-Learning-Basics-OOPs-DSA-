package Search_sorting_algorithm.Linear_search;
import java.util.*;
public class find_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = sc.next();
        System.out.print("Enter target character: ");
        char target = sc.next().charAt(0);
        int ans = findingString(name, target);
        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + ans);
        }
        sc.close();
    }

    
    static int findingString(String str, char target) {
        if(str.length()==0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}