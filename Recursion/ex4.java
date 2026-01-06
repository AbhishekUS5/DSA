public class ex4 {
    static void tail1(int n) {
        if (n == 0) {   // base case
            return;
        }
        tail1(n - 1); // head
        System.out.println(n);
        tail1(n - 1); //tail
    }

    public static void main(String[] args) {
        int n = 5;
        tail1(n);
    }
}
