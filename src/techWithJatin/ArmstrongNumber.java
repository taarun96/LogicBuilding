package techWithJatin;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number=153;
        int finalNumber=number;
        int value=0;
        while(number!=0) {
            int digit = number % 10;
            System.out.println("Digit: " + digit);
            System.out.println("Number after removing last digit: " + number);
            value = value + (digit * digit * digit);
            System.out.println(value);
            number = number / 10;
        }
        if(finalNumber==value){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
