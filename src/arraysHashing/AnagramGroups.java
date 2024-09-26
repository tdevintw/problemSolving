package arraysHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class  AnagramGroups {
    public  static List<List<String>> groupAnagrams(String[] strs) {
        List<String> allWords = new ArrayList<>();
        List<List<String>> nestedListOfStrings = new ArrayList<>();
        for(String word : strs){
            allWords.add(word);
        }
        int j =0;
        while(!allWords.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(allWords.get(j));
            for(int i = j+1  ; i<allWords.size(); i++){

                if(isAnagram(allWords.get(j),allWords.get(i))){
                    list.add(allWords.get(i));
                    allWords.remove(i);
                    i=0;
                }
            }
            allWords.remove(j);
            nestedListOfStrings.add(list);
        }
        return nestedListOfStrings;
    }

    public static boolean  isAnagram(String a , String b){
        if(a.length()!=b.length()){
            return false;
        }
        Map<Character , Integer> mapOfA = new HashMap<>();
        Map<Character , Integer> mapOfB = new HashMap<>();
        for(int i = 0 ; i<a.length() ; i++){
            if(mapOfA.containsKey(a.charAt(i))){
                mapOfA.put(a.charAt(i) ,mapOfA.get(a.charAt(i)) + 1 );
            }else{
                mapOfA.put(a.charAt(i) ,1);
            }

            if(mapOfB.containsKey(b.charAt(i))){
                mapOfB.put(b.charAt(i) ,mapOfB.get(b.charAt(i)) + 1 );
            }else{
                mapOfB.put(b.charAt(i) ,1);
            }
        }
        return mapOfA.equals(mapOfB);
    }
}

