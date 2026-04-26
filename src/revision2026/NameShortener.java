package revision2026;

public class NameShortener {
    public static void main(String[] args) {
        String str="Taarun Purusothaman";
        String nameParts[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        if(nameParts.length<2){
            System.out.println(str);
        }
        else{
            for(int i=0;i<nameParts.length-1;i++){
                sb.append(nameParts[i].charAt(0)).append(".");
            }
            System.out.println(sb);
            sb.append(nameParts[nameParts.length-1]);
            System.out.print(sb.toString());
        }
    }
}
