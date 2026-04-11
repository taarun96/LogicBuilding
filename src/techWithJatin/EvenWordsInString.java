package techWithJatin;

import java.util.HashMap;
import java.util.Map;

public class EvenWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Taarun Nive Jack are good guys";
		String str1[]=str.split(" ");
		for(String s:str1) {
			if(s.length()%2==0 && s.length()>0 ) {
				System.out.println(s);
			}
		}
		
		System.out.println("***************************");
		// TODO Auto-generated method stub
		String words = "Taarun Nive Jack are good guys";
        String[] word = words.split(" ");

        for (int i = 0; i < word.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(word[i]);
            }
        }}

	}


