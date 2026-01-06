public class ex3 {
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println("gfg "+ n);
        fun(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
}
