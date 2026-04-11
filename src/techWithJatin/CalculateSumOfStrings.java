package techWithJatin;

import java.util.LinkedHashMap;

public class CalculateSumOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Taarun 100 Nive 200 Jack 300";
		String str1[]=str.split(" ");
		int sum=0;
		for(String s:str1) {
			try {
				int num=Integer.parseInt(s);
				System.out.println(num);
				sum+=num;
			}
			catch(NumberFormatException e) {
				// Ignore non-numeric strings
				continue;
			}
		}
		System.out.println("Sum of numbers in the string: "+sum);

	}

}
