package techWithJatin;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int input[]= {7,5,4,5,1,8,2};
			int finalArray[]=new int[input.length];
			for(int i=input.length-1;i>=0;i--) {
				System.out.println(input[i]);
				finalArray[i]=input[i];
				}
			System.out.println("Reversed Array:"+Arrays.toString(finalArray));
			}
		
	}


