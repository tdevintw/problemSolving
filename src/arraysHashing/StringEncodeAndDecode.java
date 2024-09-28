package arraysHashing;

import java.util.Arrays;
import java.util.List;

public class StringEncodeAndDecode {
    public static String encode(List<String> strs) {
        if (strs.size() == 1) {
            return strs.getFirst();
        } else {
            return strs.getFirst() + " " + encode(strs.subList(1, strs.size()));
        }
    }

    public static List<String> decode(String str) {
       return  Arrays.stream(str.split(" ")).toList();
    }

}