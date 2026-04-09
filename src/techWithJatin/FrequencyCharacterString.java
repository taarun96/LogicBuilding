package techWithJatin;

import java.util.LinkedHashMap;

public class FrequencyCharacterString {
    public static void main(String[] args) {
        String str="taarun purusothaman";
        char str1[]=str.toCharArray();
        LinkedHashMap<Character,Integer> frequencyMap=new LinkedHashMap<Character,Integer>();
        for(char c:str1){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);

    }
        StringBuilder sb=new StringBuilder();
        for(char c:frequencyMap.keySet()){
            System.out.println(c+":"+frequencyMap.get(c));
            // sb.append(c).append(frequencyMap.get(c));
        }
    }
}
