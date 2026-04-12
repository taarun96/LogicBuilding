package techWithJatin;

public class VowelWithX {

	public static void main(String[] args) {
        String input = "Taarun";
        StringBuilder result = new StringBuilder();

        for (char currentChar : input.toCharArray()) {
            if (isVowel(currentChar)) {
                result.append('x');
            } else {
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());
    }

    public static boolean isVowel(char currentChar) {
        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'
                || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O'
                || currentChar == 'U') {
            return true;
        } else {
            return false;
        }
    }

}
