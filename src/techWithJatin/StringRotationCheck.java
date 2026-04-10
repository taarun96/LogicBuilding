package techWithJatin;

public class StringRotationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1="Interview";
			String s2="viewInter";
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			if(s1.length()!=s2.length()) {
				System.out.println("Not a rotation");
			}
			else {
				String s3=s1+s1;
				if(s3.contains(s2)) {
					System.out.println("Rotation");
				}
				else {
					System.out.println("Not a rotation");
				}
			}
	}

}
