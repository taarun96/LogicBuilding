package techWithJatin;

public class PalindromeNumberUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2345;

		// Convert this number to String
		String originalNumberInString = Integer.toString(number);
		String originalNumberInString2 = number + "";

		// Reverse this String and for that i will using a special Class
		// String Builder!!

		StringBuilder revereStringBuilder = new StringBuilder(originalNumberInString);
		String reverseString = revereStringBuilder.reverse().toString();
		System.out.println(revereStringBuilder.reverse());

		// Compare 2 Strings
		if (originalNumberInString.equals(reverseString)) {
		    System.out.println("Palindrome");
		} else {
		    System.out.println("Its not a palindrome");
		}
	}

}
