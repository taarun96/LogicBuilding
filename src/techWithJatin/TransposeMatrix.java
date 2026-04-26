package techWithJatin;


public class TransposeMatrix {

    public static void main(String[] args) {
        // Initializing a 2x3 Matrix
        int a[][] = new int[2][3];
        
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        
        System.out.println(a[0].length);

        // Validation check (as shown in the video)
        if (a == null || a.length == 0 || a[0].length == 0) {
            System.out.println("Transpose is not possible");
        } else {
            // Print the original matrix
            for (int row = 0; row < a.length; row++) {
                for (int col = 0; col < a[0].length; col++) {
                    System.out.print(a[row][col] + " ");
                }
                System.out.println("");
            }

            // Define the result matrix with swapped dimensions (3x2)
            int result[][] = new int[3][2];

            // Core Logic for Transpose
            for (int row = 0; row < a.length; row++) {
                for (int col = 0; col < a[0].length; col++) {
                    result[col][row] = a[row][col];
                }
            }

            // Print the transposed result
            System.out.println("--- Transposed Result ---");
            for (int row = 0; row < result.length; row++) {
                for (int col = 0; col < result[0].length; col++) {
                    System.out.print(result[row][col] + " ");
                }
                System.out.println("");
            }
        }
    }
}