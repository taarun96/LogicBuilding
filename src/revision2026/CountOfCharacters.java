package revision2026;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountOfCharacters {
    public static void main(String[] args) {
        String str = "Taarun";
        String str1[] = str.split("");

        LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<>();
        for (String s : str1) {
            if (hm1.containsKey(s)) {
                hm1.put(s, hm1.get(s) + 1);
            } else {
                hm1.put(s, 1);
            }
        }
        System.out.println(hm1);
    }
}