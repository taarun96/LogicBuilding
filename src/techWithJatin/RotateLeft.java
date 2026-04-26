package techWithJatin;

import java.util.Arrays;

public class RotateLeft {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        System.out.println(Arrays.toString(a));
        // Handle cases where k is greater than array length
        k = k % a.length;

        // Step 1: Reverse the first k elements
        a = reverse(a, 0, k - 1);
        System.out.println(Arrays.toString(a));
        // Step 2: Reverse the remaining elements
        a = reverse(a, k, a.length - 1);
        System.out.println(Arrays.toString(a));
        // Step 3: Reverse the whole array
        a = reverse(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    private static int[] reverse(int[] a, int left, int right) {
        int temp;
        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            
            left++;
            right--;
        }
        return a;
    }
}