package techWithJatin;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        // Input sorted arrays
        int a1[] = {1, 2, 4,7};
        int a2[] = {1,2,4,5,6};
        
        // Resultant array size is sum of both input arrays
        int a3[] = new int[a1.length + a2.length];

        int p1 = 0; // Pointer for a1
        int p2 = 0; // Pointer for a2
        int p3 = 0; // Pointer for a3 (result)

        // Compare elements from both arrays and add the smaller one to a3
        while (p1 < a1.length && p2 < a2.length) {
            if (a1[p1] < a2[p2]) {
                a3[p3] = a1[p1];
                p1++;
      
            } else {
                a3[p3] = a2[p2];
                p2++;
            }
            p3++;
        }

        // If elements remain in a1, add them to a3
        while (p1 < a1.length) {
            a3[p3] = a1[p1];
            p1++;
            p3++;
        }

        // If elements remain in a2, add them to a3
        while (p2 < a2.length) {
            a3[p3] = a2[p2];
            p2++;
            p3++;
        }

        // Print the final merged array
        System.out.println("Merged Array: " + Arrays.toString(a3));
    }
}