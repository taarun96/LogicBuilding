package techWithJatin;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number=5;
			for(int row=1;row<=number;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(col);
				}
				System.out.println();
			}
			
			for(int row=1;row<=number;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print((char)('a'+col-1));
				}
				System.out.println();
			}
	}

}
