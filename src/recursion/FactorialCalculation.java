/*
 * Problem: Compute the factorial of a given non-negative integer n, where factorial
 * is defined as the product of all positive integers up to n.
 *
 * Example:
 * Input: n = 4
 * Output: 24
 */


package recursion;

public class FactorialCalculation {

    public long calculateFactorial(long n){
        if(n==1){
            return 1;
        }else{
            return n * calculateFactorial(n-1);
        }
    }
}
