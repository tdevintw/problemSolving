/*
 * Problem: Reverse a given string using recursion.
 *
 * Example:
 * Input: str = "hello"
 * Output: "olleh"
 */


package recursion;

public class StringReversal {
    public String stringReversal(String string){
        int n = string.length();
        if(n==0){
             return string;
        }else{
            return  string.substring(n-1,n) + stringReversal(string.substring(0,n-1));
        }
    }
}
