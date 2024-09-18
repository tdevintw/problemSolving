package Recursion;

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
