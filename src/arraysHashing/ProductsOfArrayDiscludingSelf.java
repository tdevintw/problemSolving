package arraysHashing;

import java.util.*;

public class ProductsOfArrayDiscludingSelf {
    public static int[] getArray(int[] array){
        long originalSize = array.length;
        int[] newArray = new int[array.length];
        int i =  0;
        for(int a : array){
            long size = Arrays.stream(array).filter(a1->a!=a1).count();
            OptionalInt product =   Arrays.stream(array).filter(a1->a!=a1).reduce((a1, a2)->a1*a2);
            int newProduct;
                if(product.isEmpty()){
                     newProduct = a;
                }else{
                     newProduct = product.getAsInt();
                }
              if(originalSize+1>size){
                  long loopTimes = originalSize-size-1;
                  for (int k = 1 ; k<= loopTimes; k++){
                      newProduct = newProduct * a;
                  }
              }
              newArray[i] = newProduct;

          i++;
        }
       return  newArray;
    }
}
