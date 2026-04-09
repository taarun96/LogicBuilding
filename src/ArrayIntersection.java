import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 5, 5, 5};
        int[] arr2 = {2, 2, 3, 5, 5, 7};

        // ---------- build frequency map for arr1 ----------
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            if (freq.containsKey(num)) {           // already seen: increment
                int count = freq.get(num);
                freq.put(num, count + 1);
            } else {                               // first time seen
                freq.put(num, 1);
            }
        }

        // ---------- collect intersection with duplicates ----------
        List<Integer> intersection = new ArrayList<>();
        for (int num : arr2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                intersection.add(num);             // keep duplicate
                freq.put(num, freq.get(num) - 1);  // decrement remaining count
            }
        }

        System.out.println("Intersection with duplicates: " + intersection);
    }
}