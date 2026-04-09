package techWithJatin;

public class EYStringManipulation2 {
    public static void main(String[] args) {
        String str = "R@vi56 Kum$#!ar67";
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(char c:str.toCharArray()){
            if(Character.isLetter(c) || Character.isWhitespace(c)){
                sb.append(c);
            }
            else{
                if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);                }
            }
        }
        sb.append(" ");
        System.out.println(sb.append(sum));


    }
}
