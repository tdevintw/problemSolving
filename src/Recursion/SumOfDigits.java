package Recursion;

public class SumOfDigits {
    public long sumOfDigits(long n){
        if(n==0){
            return 0;
        }else{
            return n+sumOfDigits(n-1);
        }
    }
}
