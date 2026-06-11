package Practice_basics_java.Basic_learning;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter empID: ");
        int empID = in.nextInt();
        System.out.print("Enter department: ");
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
                break;
        }

        in.close();
    }
}
