import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTrial {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,11};
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();

        int count=0;
        int count1=0;
        for (int i = 0; i <= array.length-1 ; i++) {
            if(array[i]%2!=0){
                oddArray.add(array[i]);
                count++;
            }
            else{
                evenArray.add(array[i]);
                count1++;
            }

        }
        System.out.println(oddArray);
        System.out.println(evenArray);
    }
}
