package techWithJatin;

public class ReverseInteger {
    public static void main(String[] args) {
        int number = 12345;
        int  reverseNumber= 0;
        int lastDigit=0;
        while (number != 0) {
             lastDigit = number % 10; // Get the last digit
            reverseNumber = reverseNumber * 10 + lastDigit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit
        }

        // Check for overflow
        if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
            System.out.println(0);
            System.exit(0);
        }

        if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
            System.out.println(0);
            System.exit(0); // Underflow, return 0
        }

        System.out.println("Reversed Number: " + reverseNumber);
    }
}
