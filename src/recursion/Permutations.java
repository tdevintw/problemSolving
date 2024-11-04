/*
 * Problem: Generate all permutations of a given string.
 *
 * Example:
 * Input: str = "abc"
 * Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
 */


package recursion;

public class Permutations {

    public static int permutationsCount(int totalElement , int spots){
        if(spots==1){
            return totalElement;
        }else{
            return totalElement * permutationsCount(totalElement-1 , spots-1);
        }
    }
}
