package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class percentage {
    
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of first subject: ");
        int  a=sc.nextInt();
        System.out.println("enter the marks of first subject: ");
        int  b=sc.nextInt();
        System.out.println("enter the marks of first subject: ");
        int  c=sc.nextInt();
        
        int totalMarks=300;
        int marks=a+b+c;
        double percentage=(marks*100.0)/totalMarks;
        System.out.println("percenatage of the 3 subjects is: "+ percentage);

        if (percentage>=90 && percentage<=100){
            System.out.println("Grade A");
        }else if (percentage>=80){
            System.out.println("Grade B");
        }else if (percentage>=70){
            System.out.println("Grade c");
        }else{
            System.out.println("fail");
        }
        sc.close();
    }
}
