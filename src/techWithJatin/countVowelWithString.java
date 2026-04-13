package techWithJatin;

public class countVowelWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
        String vowelString = "aeiouAEIOU";
        int count = 0;

        // Traversing the Individual Chars from String
        for (int index = 0; index <= input.length() - 1; index++) {
            
            if (vowelString.indexOf(input.charAt(index)) != -1) {
                count++;
            }
        }

        System.out.println("Total Number Of Vowels are " + count);
    
	}

}
