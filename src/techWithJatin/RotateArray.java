package techWithJatin;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        arr=reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int k=3;
        arr=reverseArray(arr,0,k-1);
        System.out.println(Arrays.toString(arr));
        arr=reverseArray(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseArray(int[] arr,int left,int right) {

        int temp;
        while(left<right){
            temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
        return arr;
    }
}
