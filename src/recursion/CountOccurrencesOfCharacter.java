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
