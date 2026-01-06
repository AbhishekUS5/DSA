public class ex8 {
    static void puzzle(int n){
        if(n > 0){
            System.out.println(n + " ");
            puzzle(n-1);
            puzzle(n-1);
        }
    }
    public static void main(String[] args) {
        int n=3;
        puzzle(n);
    }
}
/*puzzle(3) → n=3 > 0
│
├── Prints: "3 "
│
├── First recursive call: puzzle(2) → n=2 > 0
│   │
│   ├── Prints: "2 "
│   │
│   ├── First recursive call: puzzle(1) → n=1 > 0
│   │   │
│   │   ├── Prints: "1 "
│   │   │
│   │   ├── First recursive call: puzzle(0) → n=0 ≤ 0 → returns (base case)
│   │   │
│   │   ├── Second recursive call: puzzle(0) → n=0 ≤ 0 → returns (base case)
│   │   │
│   │   └── Returns from puzzle(1)
│   │
│   ├── Second recursive call: puzzle(1) → n=1 > 0
│   │   │
│   │   ├── Prints: "1 "
│   │   │
│   │   ├── First recursive call: puzzle(0) → n=0 ≤ 0 → returns
│   │   │
│   │   ├── Second recursive call: puzzle(0) → n=0 ≤ 0 → returns
│   │   │
│   │   └── Returns from puzzle(1)
│   │
│   └── Returns from puzzle(2)
│
├── Second recursive call: puzzle(2) → n=2 > 0
│   │
│   ├── Prints: "2 "
│   │
│   ├── First recursive call: puzzle(1) → n=1 > 0
│   │   │
│   │   ├── Prints: "1 "
│   │   │
│   │   ├── First recursive call: puzzle(0) → returns
│   │   │
│   │   ├── Second recursive call: puzzle(0) → returns
│   │   │
│   │   └── Returns from puzzle(1)
│   │
│   ├── Second recursive call: puzzle(1) → n=1 > 0
│   │   │
│   │   ├── Prints: "1 "
│   │   │
│   │   ├── First recursive call: puzzle(0) → returns
│   │   │
│   │   ├── Second recursive call: puzzle(0) → returns
│   │   │
│   │   └── Returns from puzzle(1)
│   │
│   └── Returns from puzzle(2)
│
└── Returns from puzzle(3)

Given: n = 3
Step-by-Step Trace:
1. Initial Call: puzzle(3)
3 > 0 → true

Prints: 3

Calls: puzzle(2) (first call)

2. puzzle(2) (from first call of puzzle(3))
2 > 0 → true

Prints: 2

Calls: puzzle(1) (first call)

3. puzzle(1) (from first call of puzzle(2))
1 > 0 → true

Prints: 1

Calls: puzzle(0) (first call)

4. puzzle(0) (from first call of puzzle(1))
0 > 0 → false

Returns immediately (base case)

5. Back to puzzle(1)
Returns from first puzzle(0) call

Now executes second call: puzzle(0) again

puzzle(0) returns immediately

puzzle(1) finishes

6. Back to puzzle(2)
Returns from first puzzle(1) call

Now executes second call: puzzle(1) again

7. Second puzzle(1) (from second call of puzzle(2))
1 > 0 → true

Prints: 1 (again)

Calls: puzzle(0) (first call) → returns

Calls: puzzle(0) (second call) → returns

Finishes

8. Back to puzzle(2)
Returns from second puzzle(1) call

puzzle(2) finishes

9. Back to puzzle(3)
Returns from first puzzle(2) call

Now executes second call: puzzle(2) again

10. Second puzzle(2) (from second call of puzzle(3))
2 > 0 → true

Prints: 2 (again)

Calls: puzzle(1) (first call)

11. puzzle(1) (from first call of second puzzle(2))
1 > 0 → true

Prints: 1 (third time)

Calls: puzzle(0) → returns

Calls: puzzle(0) → returns

Finishes

12. Back to second puzzle(2)
Returns from first puzzle(1) call

Now executes second call: puzzle(1) again

13. puzzle(1) (from second call of second puzzle(2))
1 > 0 → true

Prints: 1 (fourth time)

Calls: puzzle(0) → returns

Calls: puzzle(0) → returns

Finishes

14. Second puzzle(2) finishes
15. Back to puzzle(3) finishes
        */