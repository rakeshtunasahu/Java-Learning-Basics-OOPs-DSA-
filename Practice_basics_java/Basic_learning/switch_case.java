package Practice_basics_java.Basic_learning;
import java.util.*;
public class switch_case {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the fruit name: ");
        String fruit=sc.next();

        switch(fruit){
            case "mango":
                System.out.println("this i king of the fruit");
                break;

            case "apple":
                System.out.println("red a cherry");
                break;
            
            case "banana":
                System.out.println("yellow in colour");
                break;
             default:
                System.out.println("not exist");

        }
        sc.close();
    }
}
