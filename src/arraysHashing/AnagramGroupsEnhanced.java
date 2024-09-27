package arraysHashing;

import java.util.*;

public class AnagramGroupsEnhanced {
    public static void AnagramGroups(String[] array) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> singleGroup;
        for (String s : array) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String string = Arrays.toString(charArray);
            if (!map.containsKey(string)) {
                singleGroup = new ArrayList<>();
            } else {
                singleGroup = map.get(string);
            }
            singleGroup.add(s);
            map.put(string, singleGroup);

        }
        System.out.println(map.values());
    }
}
