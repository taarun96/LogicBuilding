package techWithJatin;

import  java.util.Arrays;

public class StringAnagramSolution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram");
		}
		else {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not anagram");
			}
		}

	}

}
