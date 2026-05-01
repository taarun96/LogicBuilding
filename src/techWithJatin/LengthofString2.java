package techWithJatin;

public class LengthofString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "Hello World";
		System.out.println(data.length()); // Standard way for reference

		int count = 0;

		while (true) {
			try {
				// accessing character at current count
				data.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				// When we hit the end of the string, this exception triggers
				System.out.println(count);
				break; // Exit the infinite loop
			}
		}
	}
}
