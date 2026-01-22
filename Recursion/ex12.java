public class ex12 {
    static void printNumber(int n){
        if(n <= 0)
            return;
        System.out.println(n+ " ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Output ");
        printNumber(n);
    }
}
