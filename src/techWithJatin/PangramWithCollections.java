package techWithJatin;

import java.util.HashSet;

public class PangramWithCollections {
	public static void main(String[] args) {
		String str = "The quick brown fo jumps over the lazy dog";
		str = str.toLowerCase();

		HashSet<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if(Character.isLetter(ch))
			set.add(ch);
		}
		System.out.println(set);
		if (set.size() == 26) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}
	}

}
