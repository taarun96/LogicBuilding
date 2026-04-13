package techWithJatin;

public class reverseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		char data[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		
		for(char c:data) {
			if(Character.isLowerCase(c)) {
				
				sb.append(Character.toUpperCase(c));
			
			}
			else if(Character.isUpperCase(c)){
				sb.append(Character.toLowerCase(c));
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
