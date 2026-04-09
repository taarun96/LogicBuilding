package techWithJatin;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase();
		boolean isPangram = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if(str.length()<26) {
				isPangram=false;
				break;
			}
			else if (str.indexOf(ch) == -1) {
				isPangram = false;
				break;
			}
			
		}
		if (isPangram) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}
	}

}
