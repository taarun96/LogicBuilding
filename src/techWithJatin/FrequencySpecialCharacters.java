package techWithJatin;

import java.util.LinkedHashMap;

public class FrequencySpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "a@b#c$d%a@b#c$d%a@b#c$d%";
			int count=0;
			LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
			for(char c: s.toCharArray()) {
				if(!Character.isLetterOrDigit(c)) {
					map.put(c, map.getOrDefault(c, 0)+1);
					count ++;
				}
			}
			System.out.println("frequencyofchars:"+map);
			System.out.println("totalSpecialCharacters:"+count);
	}

}
