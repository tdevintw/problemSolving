package arraysHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            list1.add(s.charAt(i));
            i++;
        }
        i = 0;
        while (i < t.length()) {
            list2.add(t.charAt(i));
            i++;
        }
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);

    }
}
