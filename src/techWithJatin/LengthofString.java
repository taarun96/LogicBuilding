package techWithJatin;

public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		char[] data = str.toCharArray();
		int count = 0;
		for (char c : data) {
			count++;
		}
		System.out.println("Length of the string is: " + count);
	}

}
