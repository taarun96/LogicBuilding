package techWithJatin;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Original Map with String keys and Integer values
        Map<String, Integer> ogMap = new HashMap<String, Integer>();
        ogMap.put("A", 1);
        ogMap.put("B", 2);
        ogMap.put("C", 3);

        System.out.println("Original Map: " + ogMap);

        // Reverse Map with Integer keys and String values
        Map<Integer, String> reverseMap = new HashMap<Integer, String>();
        
        // Iterating through the entrySet of the original map
        for (Map.Entry<String, Integer> data : ogMap.entrySet()) {
            
            // Putting the Value of ogMap as the Key of reverseMap
            // Putting the Key of ogMap as the Value of reverseMap
            reverseMap.put(data.getValue(), data.getKey());
        }

        System.out.println("Reversed Map: " + reverseMap);
	}

}
