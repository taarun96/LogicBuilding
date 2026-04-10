package techWithJatin;

public class NameGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Raj","Rahul"};
		StringBuilder sb = new StringBuilder();
		int maxLength = 0;
		for(String name:names) {
			if(name.length()>maxLength) {
				maxLength=name.length();
			}
		}
		for(int i=0;i<maxLength;i++) {
			 for(String name:names) {
				 if(i<name.length()) {
					 sb.append(name.charAt(i));
				 }
			 }
		}
		 System.out.println(sb.toString());

		
	}

}
