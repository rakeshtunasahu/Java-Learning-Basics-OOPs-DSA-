package Number_system;

public class Find_unique {
    public static void main(String[] args) {
        int [] a={3,5,3,2,1,6,5,1,2};
        System.out.println(findunique(a));
    }
    static int findunique(int [] a){
        int unique =0;
        for(int n : a){
            unique^=n;
        }
        return unique;
    }
}
