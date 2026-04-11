package techWithJatin;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=434;
		int originalNumber=num;
		int lastDigit=0;
		int reverseNumber=0;
		
		while(num>0) {
			lastDigit=num%10;
			reverseNumber=reverseNumber*10+lastDigit;
			num=num/10;
		}
		System.out.println(reverseNumber);
		if(originalNumber==reverseNumber) {
			System.out.println(originalNumber+":It is a palindrome number");
		}
		else {
			System.out.println(originalNumber+":It is not a palindrome number");
		}

	}

}
