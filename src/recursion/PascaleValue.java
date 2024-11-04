/*
 * Problem: Calculate the value at a specific row and column in Pascal's Triangle.
 *
 * Example:
 * Input: row = 4, col = 2
 * Output: 6
 *
 * Pascal's Triangle:
 *         1
 *       1   1
 *     1   2   1
 *   1   3   3   1
 * 1   4   6   4   1
 */


package recursion;

public class PascaleValue {

    public static long getPascaleValue(long n , long k){
        if(n==0){
            return 1;
        }
        if(k ==0 || k==n){
            return 1;
        }else{
            return getPascaleValue(n-1,k-1) + getPascaleValue(n-1 , k);
        }
    }
}
