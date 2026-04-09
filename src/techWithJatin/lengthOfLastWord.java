package techWithJatin;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String str="taarun purusothaman is a good boy";
        String  str1[]=str.split(" ");
        System.out.println(str1[str1.length-1].length());
    }
}
