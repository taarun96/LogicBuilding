package techWithJatin;

import java.util.Arrays;

public class JPMorganMoveRight_Sort {
    public static void main(String[] args) {
        int num[] = {1, 0, -2, 45, 6, 0, 8, 3, 9};
        int finalArray[] = new int[num.length];
        int count=0;
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] != 0) {
                finalArray[count] = num[i];
                count++;
            }

        }
        Arrays.sort(finalArray,0,count);
        System.out.println(Arrays.toString(finalArray));
        for(int j:finalArray){
            System.out.print(j+" ");
        }

    }
}

