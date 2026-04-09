import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {

        public static void main(String[] args) {
            String str="Selenium is an an very very powerful automation powerful tool powerful";
            String str1[]=str.split(" ");
          /*  for(int i=0;i<=str1.length-1;i++){
                System.out.println(str1[i]);
            }   */
            HashMap<String,Integer> hm1=new HashMap<>(); //using HashMap to have key,value pair
            for (String s:str1) {
                if (hm1.containsKey(s)) {
                    hm1.put(s, hm1.get(s) + 1);
                } else {
                    hm1.put(s, 1);
                }
            }

            System.out.println(hm1);
            Set<String> uniqueWords=hm1.keySet();//to identify the unique keys in sentence we use Set
            System.out.println(uniqueWords);
            for(String s:uniqueWords){
                if(hm1.get(s)>1){
                    System.out.println(s+":"+ hm1.get(s));
                }
            }
        }


}
