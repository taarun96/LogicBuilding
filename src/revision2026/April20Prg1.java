package revision2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class April20Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "old is gold but gold is gold";
		String str1[] = str.split(" ");
		LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<>();
		for (String s : str1) {
			if (hm1.containsKey(s)) {
				hm1.put(s, hm1.get(s) + 1);
			} else {
				hm1.put(s, 1);
			}
		}

		System.out.println(hm1);

		Set<String> uniqueWords = hm1.keySet();// to identify the unique keys in sentence we use Set
		System.out.println(uniqueWords);
		for (String s : uniqueWords) {
			if (hm1.get(s) > 1) {
				System.out.println(s + ":" + hm1.get(s));
			}
		}
		int firstMaxFrequency = 0;
		int secondMaxFrequency = 0;

		for (Map.Entry<String, Integer> entry : hm1.entrySet()) {
			if (entry.getValue() > firstMaxFrequency) {
				secondMaxFrequency = firstMaxFrequency;
				firstMaxFrequency = entry.getValue();
			} else if (entry.getValue() != firstMaxFrequency & entry.getValue() > secondMaxFrequency) {
				secondMaxFrequency = entry.getValue();
			}
		}
			System.out.println(secondMaxFrequency);
			for (Map.Entry<String, Integer> entry1 : hm1.entrySet()) {
				if (entry1.getValue() == secondMaxFrequency) {
					System.out.println("SecondMostFrequentCharacter:" + entry1.getKey());
				}

			}

		}

	}
