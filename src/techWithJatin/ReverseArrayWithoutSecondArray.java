package techWithJatin;

import java.util.Arrays;

public class ReverseArrayWithoutSecondArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int input[]= {1,2,3,4,5};
			int n = input.length;
			for(int i=0;i<n/2;i++) {
				int temp = input[i];
				input[i] = input[n-1-i];
				input[n-1-i] = temp;
			}
			for(int i=0;i<n;i++) {
				System.out.print(input[i]+" ");
			}
			System.out.println();
			System.out.println(Arrays.toString(input));
	}

}
