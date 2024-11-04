/*
 * Problem: Calculate the result of raising a base number to a specified exponent using recursion.
 *
 * Example:
 * Input: base = 2, exponent = 3
 * Output: 8
 */


package recursion;

public class PowerCalculation {

    public static long powerCalculation(int number , int power){
        if(power==1){
            return number;
        }else{
            return number * powerCalculation(number , power-1);
        }
    }
}
