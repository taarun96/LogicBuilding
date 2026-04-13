package techWithJatin;

public class OnlyVowelReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String input = "hello"; // Input string
		        String vowelsString = "aeiouAEIOU";
		        
		        char inputArray[] = input.toCharArray();
		        int left = 0;
		        int right = inputArray.length - 1;

		        while (left < right) {
		            // If the left character is not a vowel, move the pointer right
		            if (vowelsString.indexOf(inputArray[left]) == -1) {
		                left++;
		            } 
		            // If the right character is not a vowel, move the pointer left
		            else if (vowelsString.indexOf(inputArray[right]) == -1) {
		                right--;
		            } 
		            // If both are vowels, swap them
		            else {
		                char temp;
		                temp = inputArray[left];
		                inputArray[left] = inputArray[right];
		                inputArray[right] = temp;
		                
		                left++;
		                right--;
		            }
		        }
		        
		        // Convert the char array back to a string for the output
		        String result = new String(inputArray);
		        System.out.println(result);
		    }

	}

