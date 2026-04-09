public class vowelUsingSwitch {
    public static void main(String[] args) {
        char ch = 'a';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }

        System.out.println(9/0);
    }
}
