package revision2026;

import java.util.*;

public class DuplicateCharactersUsingSet {
    public static void main(String[] args) {
        String str="Taarun";
        char str1[]=str.toCharArray();
        Set<Character> uniqueChars=new LinkedHashSet<Character>();
        for(char Character: str1){
            uniqueChars.add(Character);
        }
       // System.out.println(uniqueChars);
        for(char Character:uniqueChars){
            System.out.print(Character);
        }
    }
}
