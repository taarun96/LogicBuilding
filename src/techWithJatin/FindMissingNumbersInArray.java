package techWithJatin;

public class FindMissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1, 2, 4, 5, 6};
        int totalNumbers = 6; // The range of numbers (1 to 6)
        
        // Step 1: Calculate the expected sum using the formula
        int totalSumOfAllNumbers = (totalNumbers * (totalNumbers + 1)) / 2;
        System.out.println("Expected Sum: " + totalSumOfAllNumbers);

        // Step 2: Calculate the actual sum of elements present in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Actual Sum: " + sum);

        // Step 3: The difference is the missing number
        System.out.println("The missing Number is: " + (totalSumOfAllNumbers - sum));
    }
}
