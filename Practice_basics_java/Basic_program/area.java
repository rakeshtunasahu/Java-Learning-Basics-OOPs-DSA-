package Practice_basics_java.Basic_program;

import java.util.Scanner;

public class area {
    public static double calculateCircleArea(double r){
        double pie=3.14;
        return pie * r * r;
    }
    public static double calculateRectangleArea(double l, double b){
        return l*b;
    }
    public static double calculateSquareArea(double s){
        return s*s;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circle_area = calculateCircleArea(radius);
        System.out.println("Area of Circle: " + circle_area);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        double rectangle_area = calculateRectangleArea(length ,breadth);
        System.out.println("Area of Circle: " +  rectangle_area);


        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        
        double square_area = calculateSquareArea(side);
        System.out.println("Area of Circle: " + square_area);
        sc.close();

    }
}
