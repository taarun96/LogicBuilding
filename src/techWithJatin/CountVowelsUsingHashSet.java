package techWithJatin;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
        int count = 0;
        
        // Initializing the Set with vowels
        Set<Character> vowelSet = new HashSet<Character>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');

        // Converting string to character array and checking against the Set
        for (char ch : input.toCharArray()) {
            if (vowelSet.contains(ch)) {
                count++;
            }
        }

        System.out.println("Total Number Of Vowels are " + count);
    }
	

}
