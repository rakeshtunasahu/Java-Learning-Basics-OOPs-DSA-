package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class week_days {
       public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int day =sc.nextInt();
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid day");
        }

        switch(day){
            case 1,2,3,4,5 -> System.out.println("this are weekdays");
            case 6,7 -> System.out.println("this are weekends");
            default -> System.out.println("invalid day");
        }
        sc.close();
    }
}
