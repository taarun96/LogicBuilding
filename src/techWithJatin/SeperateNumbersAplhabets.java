package techWithJatin;

public class SeperateNumbersAplhabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "Ra123I";
		    
		    StringBuilder numbers = new StringBuilder();
		    StringBuilder alphabets = new StringBuilder();

		    for (char currentChar : input.toCharArray()) {
		        if (Character.isDigit(currentChar)) {
		            numbers.append(currentChar);
		        } else if (Character.isAlphabetic(currentChar)) {
		            alphabets.append(currentChar);
		        }
		    }

		    System.out.println(alphabets.toString());
		    System.out.println(numbers.toString());

	}

}
