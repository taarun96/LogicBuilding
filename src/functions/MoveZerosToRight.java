package functions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToRight {

    public static int[] moveZeros(int[] numbers) {
        int[] finalArray = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                finalArray[count] = numbers[i];
                count++;
            }
        }
        return finalArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] result = moveZeros(numbers);
        System.out.println("Array after moving zeros to the right: " + Arrays.toString(result));
    }
}