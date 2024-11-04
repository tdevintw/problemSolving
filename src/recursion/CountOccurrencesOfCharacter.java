/*
 * Problem: Count the occurrences of a specific character in a given string using recursion.
 *
 * Example:
 * Input: str = "hello world", char = 'o'
 * Output: 2
 */


package recursion;

public class CountOccurrencesOfCharacter {

    public int countOccurrencesOfCharacter(String string , char character){
        int length = string.length();
        if(length==1){
            return string.charAt(0)==character ? 1 : 0;
        }
        else{
            return (string.charAt(length-1)==character ? 1 : 0 ) + countOccurrencesOfCharacter(string.substring(0,length-1) ,character);
        }
    }
}
