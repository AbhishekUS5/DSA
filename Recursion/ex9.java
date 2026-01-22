public class ex9 {
    static int fun(int n){
        if (n == 1)
            return 0;
        else
            return 1 + fun(n/2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(16));
    }
}
/*
fun(16) → 1 + fun(8)
    fun(8) → 1 + fun(4)
        fun(4) → 1 + fun(2)
            fun(2) → 1 + fun(1)
                fun(1) → 0 (base case)
            fun(2) → 1 + 0 = 1
        fun(4) → 1 + 1 = 2
    fun(8) → 1 + 2 = 3
fun(16) → 1 + 3 = 4 ✅
*/