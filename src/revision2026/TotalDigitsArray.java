package revision2026;

public class TotalDigitsArray
{
    public static void main(String[] args) {
        int number=673245;
        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        System.out.println("Total digits in the number: "+count);
    }
}
