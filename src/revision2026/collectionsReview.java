package revision2026;
import java.util.*;

public class collectionsReview {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Taarun");
        list.add("Purusothaman");
        list.add("is");
        list.add("a");
        list.add("good");
        System.out.println(list);

        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);

    }
}
