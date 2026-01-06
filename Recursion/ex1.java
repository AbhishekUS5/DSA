public class ex1 {
    public static int factorialRecursive(int n) {
        // Base case
        if (n == 1 || n == 0) {
            return 1;
        }
        // Recursive call
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialRecursive(n));
    }
}
/*
factorialRecursive(5)

n is not 0 or 1

Returns 5 * factorialRecursive(4)

factorialRecursive(4)

Returns 4 * factorialRecursive(3)

factorialRecursive(3)

Returns 3 * factorialRecursive(2)

factorialRecursive(2)

Returns 2 * factorialRecursive(1)

factorialRecursive(1)

Base case reached

Returns 1

Phase 2: Unwinding the Call Stack (After each return)

1. After factorialRecursive(1) completes:

Returns value 1 to factorialRecursive(2)

factorialRecursive(2) now has all values it needs: 2 * 1 = 2

factorialRecursive(2) completes, returns 2

2. After factorialRecursive(2) completes:

Returns value 2 to factorialRecursive(3)

factorialRecursive(3) calculates: 3 * 2 = 6

factorialRecursive(3) completes, returns 6

3. After factorialRecursive(3) completes:

Returns value 6 to factorialRecursive(4)

factorialRecursive(4) calculates: 4 * 6 = 24

factorialRecursive(4) completes, returns 24

4. After factorialRecursive(4) completes:

Returns value 24 to factorialRecursive(5)

factorialRecursive(5) calculates: 5 * 24 = 120

factorialRecursive(5) completes, returns 120
*/