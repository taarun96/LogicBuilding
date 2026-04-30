package techWithJatin;


public class ClosestToZero {
    public static void main(String[] args) {
        int[] arr = {7, -10, 13, 8, 4, -7,0};

        int closest = arr[0];

        for (int i = 1; i < arr.length; i++) {
        	
            // Compare absolute values
            if (Math.abs(arr[i]) < Math.abs(closest)) {
                closest = arr[i];
            }

            // If same distance from zero, choose positive number
            else if (Math.abs(arr[i]) == Math.abs(closest) && arr[i] > closest) {
                closest = arr[i];
            }
        }

        System.out.println("Closest to zero: " + closest);
    }
}