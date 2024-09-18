package arraysHashing;

import java.util.HashMap;
import java.util.Map;

public class findDuplicateElt   {

    public static boolean  isDuplicate(int[] array){
        if(array.length==0){
            return false;
        }
        Map<Integer , Integer> map = new HashMap<>();
        map.put(array[0], array[0]);
        int i = 1;
        while (i<array.length){
            if(map.containsKey(array[i])){
                return true;
            }
            map.put(array[i], array[i]);
            i++;
        }
        return false;
    }
}
