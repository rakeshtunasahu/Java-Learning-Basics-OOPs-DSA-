package Arrays_java.array_learning;
import java.util.*;

public class array_List {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
            // syntax
    ArrayList<Integer> list = new ArrayList<>(100);

    list.add(44);

    //printing the array list using the for loop

    for (int i =0;i<5;i++){
          list.add(sc.nextInt());
         
    }
         for (int i =0;i<5;i++){
            System.out.println(list.get(i));
         }
         sc.close();
    } 

}
