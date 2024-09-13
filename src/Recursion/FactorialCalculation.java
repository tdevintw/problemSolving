package Recursion;

public class FactorialCalculation {

    public long calculateFactorial(long n){
        if(n==1){
            return 1;
        }else{
            return n * calculateFactorial(n-1);
        }
    }
}
