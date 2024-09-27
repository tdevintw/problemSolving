package arraysHashing;

import java.util.*;
import java.util.stream.Collectors;

public class TopKElements {
    public static  int[] getTopKElements(int[] array , int k){
        Map<Integer , Integer> map = new HashMap<>();
        for(int number : array){
            map.computeIfAbsent(number , key-> 1);
            if(map.containsKey(number)){
                map.put(number , map.get(number)+1);
            }
        }
        Map<Integer ,Integer> sorted = map.entrySet().stream().sorted((entry1,entry2)->Integer.compare(entry2.getValue() , entry1.getValue())).limit(k).collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue ,  (e1, e2) -> e1,LinkedHashMap::new));
        int[] arrayResult =  new int[k];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry : sorted.entrySet()){
            arrayResult[i] = entry.getKey();
            ++i;
        }
        return arrayResult ;
    }
}
