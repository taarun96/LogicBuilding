import java.util.HashMap;


public class CountCharacters {
    public static void main(String[] args) {
        String str="Taarun";
        String str1[]=str.split("");
     /*   for(int i=0;i<=str1.length-1;i++){
            System.out.println(str1[i]);
        } */
        HashMap<String,Integer> hm1=new HashMap<>();
        for (String s:str1) {
            if (hm1.containsKey(s)) {
                hm1.put(s, hm1.get(s) + 1);
            } else {
                hm1.put(s, 1);
            }
        }
        System.out.println(hm1);
    }
}
