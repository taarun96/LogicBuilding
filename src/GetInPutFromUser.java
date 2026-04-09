import java.util.Scanner;

public class GetInPutFromUser {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a string:");
        char a = scanner.next().charAt(0);
        System.out.println("You entered: " +a);
         String input = scanner.nextLine();
         System.out.println("You entered: " + input);
        System.out.println("Enter a number:");
        int number=scanner.nextInt();
        System.out.println("Number entered: " + number);
         scanner.close();
        System.out.println(5);



            }
}
