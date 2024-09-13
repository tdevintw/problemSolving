package Recursion;

public class FibonacciSequence {

    public long fibonacciSequence(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
    }
}