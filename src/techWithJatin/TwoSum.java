package techWithJatin;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {7,5,4,5,1,8,2};
		int target=9;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]+input[j]==target) {
					System.out.println("index:"+i+" "+j);
					System.out.println(input[i]+" "+input[j]);
				}
			}
		}

	}

}
