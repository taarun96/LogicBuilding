package techWithJatin;

public class FindMissingNumbersInArray2 {

	public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 6};
        int missingNumber = 0;
        
        // XOR all elements present in the array
        for (int no : numbers) {
            missingNumber = missingNumber ^ no;
        }
        System.out.println("XOR of present numbers: " + missingNumber);

        // XOR with all numbers in the expected range (1 to 6)
        for (int i = 1; i <= 6; i++) {
        	   System.out.println("XOR : " + missingNumber);
            missingNumber = missingNumber ^ i;
        }

        System.out.println("The missing number is: " + missingNumber);
    }
}
