package Practice_basics_java.Basic_program;
public class occurences {
    public static void main(String [] args ){
        int n =612135267;
        int count = 0 ;
        while (count >0){
            int rem =n%10;
            if (rem ==2){
                count ++;
            }
            n=n/10;
        }

    }
}
