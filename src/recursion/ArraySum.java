package recursion;

import java.util.Arrays;

public class ArraySum {

    public long arraySum(int[] array){
        int length = array.length;

        if(length==0){
            return 0;
        }

        if(length==1){
            return array[0];
        }else{
            return array[length-1] +arraySum(Arrays.copyOfRange(array , 0 , length-1));
        }
    }
}
