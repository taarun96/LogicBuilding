package techWithJatin;

public class PrintConsecutiveNumberSum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {7,5,4,5,1,8,2};
		int target = 10;
	
		for(int i=0;i<input.length;i++) {
			int sum=0;
			for(int j=i;j<input.length;j++) {
				sum=sum+input[j];
				if(sum==target) {
					for(int k=i;k<=j;k++) {
						System.out.print(input[k]+" ");
					}
					System.out.println();
				}
			}
		}
		}

	}


