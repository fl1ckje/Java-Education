package Basics.RecursiveFunctions;

public class RecursiveFunctions {
    public RecursiveFunctions() {

        for (int n : new int[]{2, 3, 5}) {
            System.out.printf("Factorial(%d) = %d\n", n, Factorial(n));
        }

        for (int n : new int[]{2, 3, 5}) {
            System.out.printf("Fibonacci(%d) = %d\n", n, Fibonacci(n));
        }
    }

    int Factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * Factorial(x - 1);
        }
    }

    int Fibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        } else {
            return Fibonacci(x - 1) + Fibonacci(x - 2);
        }
    }

    //another version of factorial function (more optimal one)
    //int Factorial(int x) {
    //    int result = 1;
    //    for (int i = 1; i <= x; i++) {
    //        result *= i;
    //    }
    //    return result;
    //}
}
