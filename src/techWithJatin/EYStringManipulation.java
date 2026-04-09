package techWithJatin;

import java.util.ArrayList;
import java.util.List;

public class EYStringManipulation {
    public static void main(String[] args) {
        String str="a1b2c3";
        List<Character>  list=new ArrayList<Character>();

        for (char c: str.toCharArray()) {
            if (Character.isDigit(c)) {
                list.add(c);
            }
        }
        System.out.println(list);
        int index=list.size()-1;
        StringBuilder sb=new StringBuilder();
        for (char c: str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(list.get(index));
                index--;
            }
            else{
                sb.append(c);
            }
    }
        System.out.println(sb.toString());
    }
}
