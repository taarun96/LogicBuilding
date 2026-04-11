package techWithJatin;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=54321;
			int secondnum=4321;
			int count=0;
			int lastDigit=0;
			while(num>0) {
				
				lastDigit=num%10;
			//	System.out.println("lastDigit"+lastDigit);
				num=num/10;
			//	System.out.println("Number"+num);
				count++;
			}
			System.out.println(count);
			
			
			System.out.println("*************************");
			
			String str=Integer.toString(secondnum);
			System.out.println(str);
			
			
	}

}
