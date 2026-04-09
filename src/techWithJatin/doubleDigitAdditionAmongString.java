package techWithJatin;

public class doubleDigitAdditionAmongString {
    public static void main(String[] args) {
        String str="taarun12purusothaman34is56a10ll9";
        int sum=0;
        String temp="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }
            else{
                if(!temp.equals("")){
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.equals("")){
            sum+=Integer.parseInt(temp);
        }
        System.out.println("Sum of double digit numbers in the string: "+sum);
    }
}
