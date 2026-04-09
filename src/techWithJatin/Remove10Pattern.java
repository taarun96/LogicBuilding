package techWithJatin;

public class Remove10Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10010101"; 
		System.out.println(s); 
		StringBuilder sb = new StringBuilder(); 
		for(char c :s.toCharArray())
		{ 
			if(c=='0' && sb.length()>0 && sb.charAt(sb.length()-1)=='1')
				{ 
				sb.deleteCharAt(sb.length()-1); 
				System.out.println("if"+sb.toString());
				}
			else
			{ 
				sb.append(c); 
				System.out.println("else"+sb.toString()); 
			}
		} 
		System.out.println(sb.toString()); }
	}


