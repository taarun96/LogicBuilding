package techWithJatin;

import java.util.Arrays;

public class FrequencyWithoutHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String input = "abccaadcqr"; // a 3 b 1 c 2
        int frequency[] = new int[256]; // ASCII 0-256

        char inputArray[] = input.toCharArray();

        // Count frequency
        for (char currentChar : inputArray) {
            frequency[currentChar]++;
            System.out.println("first for loop:"+currentChar + " " + frequency[currentChar]);
        }
      System.out.println(frequency.length);
        // Print frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " " + frequency[i]);
            }
        }

	}

}
