package Recursion;

public class PowerCalculation {

    public long powerCalculation(int number , int power){
        if(power==1){
            return number;
        }else{
            return number * powerCalculation(number , power-1);
        }
    }
}
