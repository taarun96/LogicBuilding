package techWithJatin;

public class FbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2;
		int first=0;
		int second=1;
		int next;
		
		if(number==1) {
			System.out.println(first);
		}
		
		else {
			System.out.print(first+" "+second);
		for(int i=2;i<number;i++) {
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
			
		}
		}
		

	}

}
