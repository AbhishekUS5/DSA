public class ex10 {
    static void fun(int n){
        if(n == 0)
            return;
        fun(n/2);
        System.out.println(n%2);
    }
    public static void main(String[] args) {
        int n=7;
        fun(n);
    }
}
/*fun(7) → calls fun(3) [waits for it to finish]
    fun(3) → calls fun(1) [waits]
        fun(1) → calls fun(0) [waits]
            fun(0) → returns immediately (base case)
        fun(1) → prints 1 % 2 = 1
    fun(3) → prints 3 % 2 = 1
fun(7) → prints 7 % 2 = 1
*/