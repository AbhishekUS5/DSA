public class ex7 {
    static void fun(int n){
        if(n==0)
            return;
        fun(n-1); // head recursion
        System.out.println(n);
        fun(n-1); // tail recursion
    }
    public static void main(String[] args) {
        int n=3;
        fun(n);
    }
}
