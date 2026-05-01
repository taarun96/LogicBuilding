package techWithJatin;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is fun";
		String str1[] = str.split(" ");
			String result = "";
		for (String s : str1) {
			char[] data = s.toCharArray();
			int left = 0;
			int right = data.length - 1;
			char temp;
			while (left < right) {
				temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
			result+=new String(data)+" ";

		}
		
	System.out.println(result);

	}
}