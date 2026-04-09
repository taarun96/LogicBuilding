package techWithJatin;

public class doubleDigitAdditionAmongString2 {
    public static void main(String[] args) {

        String input = "12abc34xyz56lmn10";
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) { // Check if the Character is Number or NOT
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sum = sum + Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        // For the case where the numbers are at the end
        if (sb.length() > 0) {
            sum = sum + Integer.parseInt(sb.toString());
        }

        System.out.println(sum);
    }
}
