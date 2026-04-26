package techWithJatin;

import java.util.Arrays;

public class RotateRight {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		
		int left=0;
		int right=a.length-1;
	
		   System.out.println(Arrays.toString(a));
	        a=reverse(a,0,a.length-1);
	        System.out.println(Arrays.toString(a));
	        int k=3;
	        a=reverse(a,0,k-1);
	        System.out.println(Arrays.toString(a));
	        a=reverse(a,k,a.length-1);
	        System.out.println(Arrays.toString(a));
	}
	
	private static int [] reverse(int[] a,int left,int right) {
		int temp;
		while(left<right) {
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		return a;
		
	}

}
