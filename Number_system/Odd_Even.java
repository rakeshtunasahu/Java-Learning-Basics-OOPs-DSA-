package Number_system;

public class Odd_Even {
    public static void main(String[] args) {
        int n=65;
        System.out.println(oddeven(n));
    }
    static boolean oddeven(int n ){
        return (n & 1)== 1;
    }
}
