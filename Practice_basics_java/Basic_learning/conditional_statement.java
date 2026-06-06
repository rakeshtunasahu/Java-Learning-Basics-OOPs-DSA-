package Practice_basics_java.Basic_learning;

public class conditional_statement {
    // if statement
    public static void amin(String[] args){
    int salary =25000;

      // if statement 

    if (salary > 10000){
        salary = salary +2000;
    }
    else{
        salary = salary +500;
    }
    System.out.println(salary);

     //multiple if-else statment 

    if (salary > 10000){
        salary = salary +2000;
    }
    else if (salary >15000){
        salary = salary +1000;
    }else{
        salary += 500;
    }
     System.out.println(salary);
}
}
