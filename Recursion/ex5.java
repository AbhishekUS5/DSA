public class ex5 {
    static void fun(int n){
        if( n == 0){
            return;
        }
        System.out.println(n + " ");
        fun(n-1);
        System.err.println((n + " "));
    }
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
}
