import java.util.Arrays;

public class moveZerosToRight {
    public static void main(String[] args) {
        int[] numbers={0,23,0,5,-9,-90,0,0,1,1,0};
        int[] finalArray=new int[numbers.length];
        int count=0;
        for (int i = 0; i <= numbers.length-1 ; i++) {
                if(numbers[i]!=0){
                    finalArray[count]=numbers[i];
                    count++;
                }
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
