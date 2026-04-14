package techWithJatin;

import java.util.Arrays;

public class OnlyLetterReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String input = "a1b2c3"; // Input string
		    
		        
		        char inputArray[] = input.toCharArray();
		        int left = 0;
		        int right = inputArray.length - 1;

		        while (left < right) {
		            // If the left character is not a vowel, move the pointer right
		            if (Character.isLetter((inputArray[left]))) {
		                left++;
		            } 
		            // If the right character is not a vowel, move the pointer left
		            else if (Character.isLetter((inputArray[right]))) {
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
		        System.out.println(Arrays.toString(inputArray));
		    }

	}

