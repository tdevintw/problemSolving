/*
 * Problem: Find the greatest common divisor (GCD) of two positive integers using recursion.
 *
 * Example:
 * Input: a = 54, b = 24
 * Output: 6
 */


package recursion;

public class greatestCommonDivisor {

    public static  int gcd(int x , int y){
        if(x%y==0){
            return y;
        }else{
            return gcd(y , x%y);
        }
    }
}
