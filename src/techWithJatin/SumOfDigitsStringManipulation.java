package techWithJatin;

public class SumOfDigitsStringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc12 def467 RT6";
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(c);
				 System.out.println(sb.toString());
				 System.out.println("if length"+sb.length());
			}
			else if(sb.length()>0) {
				System.out.println("else if"+sb.toString());
				sum=sum+Integer.parseInt(sb.toString());
				System.out.println("after:"+sum);
				sb.setLength(0);
		
			}
		}
		if(sb.length()>0) {
			sum=sum+Integer.parseInt(sb.toString());

			
	
		}
	//	String result = sb.toString();
		System.out.println("finalsum:"+sum);
	}

}
