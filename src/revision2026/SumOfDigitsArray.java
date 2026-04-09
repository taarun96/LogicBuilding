package revision2026;

public class SumOfDigitsArray {
    public static void main(String[] args) {
        int arr[]={1,5,89,-87,0,45,54,-9,0,2,3};
        int sum=0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the digits in the array is: "+sum);
    }
}
