/*
 * Problem: Calculate the sum of all digits in a given positive integer n.
 *
 * Example:
 * Input: n = 1234
 * Output: 10
 */


package recursion;

public class SumOfDigits {
    public long sumOfDigits(long n){
        if(n==0){
            return 0;
        }else{
            return n+sumOfDigits(n-1);
        }
    }
}
