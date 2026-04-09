package revision2026;

import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {


   String str="Life Life Life begins begins begins when you think think everything is over it starts a new chapter in your Life";
   // String str="Life life good is";
        String str1[]=str.split(" ");

    LinkedHashMap<String,Integer> hm1=new LinkedHashMap<>();
    for(String s:str1){
        if(hm1.containsKey(s)){
            hm1.put(s,hm1.get(s)+1);
        }
        else {
            hm1.put(s,1);
        }
    }
        Set<String> uniqueWords=hm1.keySet();//to identify the unique keys in sentence we use Set
        System.out.println(hm1.keySet());
        System.out.println(uniqueWords);
        for(String s:uniqueWords){
            if(hm1.get(s)>1){
                System.out.println(s+":"+ hm1.get(s));
            }
        }

        // Get all entries
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(hm1.entrySet());
        System.out.println("list"+entries);
        // Sort by value (frequency) in descending order
        entries.sort((e1, e2) ->
                e2.getValue().compareTo(e1.getValue()));
        System.out.println("sort"+entries);
        System.out.println(entries.get(1));
        // Check if there are at least two entries with frequency > 1
        if (entries.size() >= 2 && entries.get(1).getValue() > 1) {
            Map.Entry<String, Integer> secondMost = entries.get(1);
            System.out.println("MAP:"+secondMost);
            System.out.println("Second most repeating word: " + secondMost.getKey() + ":" +
                    secondMost.getValue());
        } else {
            System.out.println("No second most repeating word found.");
        }
    }
}
