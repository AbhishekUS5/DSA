public class ex11 {
    static void fun(int n){
        if(n==0)
            return;
        fun(n/2);
        System.out.println(n%2);
        // fun(n/2);
    }
    public static void main(String[] args) {
        int n=10;
        fun(n);
    }
}
/*fun(10)
 └─ fun(5)
     └─ fun(2)
         └─ fun(1)
             └─ fun(0) → return */