package Recursion;

public class Permutations {

    public static int permutationsCount(int totalElement , int spots){
        if(spots==1){
            return totalElement;
        }else{
            return totalElement * permutationsCount(totalElement-1 , spots-1);
        }
    }
}
