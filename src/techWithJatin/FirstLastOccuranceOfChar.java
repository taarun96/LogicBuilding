package techWithJatin;

public class FirstLastOccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
        int firstIndex = -1;
        int lastIndex = -1;


        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'e') {
                firstIndex = index;
                break;
            }
        }


        for (int index = input.length() - 1; index >= 0; index--) {
            if (input.charAt(index) == 'e') {
                lastIndex = index;
                break;
            }
        }

      
        if (firstIndex < 0) {
            System.out.println("Character is not present");
        } 
        else if(firstIndex==lastIndex) {
            System.out.println("First index: " + firstIndex +".There is only one index for the character!!!");
        }
        	else {
            System.out.println("First index: " + firstIndex);
            System.out.println("Last index: " + lastIndex);
        }
    }
	

}
