/*
 * Problem: Calculate the nth Fibonacci number in the sequence, where the sequence
 * starts with 0 and 1, and each subsequent number is the sum of the previous two.
 *
 * Example:
 * Input: n = 5
 * Output: 5
 */



package recursion;

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