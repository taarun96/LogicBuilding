package revision2026;

import java.util.LinkedHashMap;
import java.util.Map;


public class SecondMostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str="aadfbfbbbff";
				LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
				for (char c:str.toCharArray()) {
					map.put(c, map.getOrDefault(c, 0)+1);
				
				}
				System.out.println(map);
				int firstMaxFreq=0;
				int secondMaxFreq=0;
				for(Map.Entry<Character, Integer> entry:map.entrySet()) {
					if(entry.getValue()>firstMaxFreq) {
						secondMaxFreq=firstMaxFreq;
						firstMaxFreq=entry.getValue();
					}
					else if(entry.getValue()>secondMaxFreq && entry.getValue()!=firstMaxFreq) {
						secondMaxFreq=entry.getValue();
					}
				}
				
				
				System.out.println("SecondMaxFrequency:"+secondMaxFreq);
				for(Map.Entry<Character, Integer> entry:map.entrySet()) {
				if(entry.getValue()==secondMaxFreq) {
					System.out.println("SecondMostFrequentCharacter:"+entry.getKey());
				}
				}
	}

}
