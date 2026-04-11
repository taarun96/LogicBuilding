package techWithJatin;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int arr[]={10,20,5,15,25};
        int  largest=Integer.MIN_VALUE;
        System.out.println(largest);
        int secondLargest=Integer.MIN_VALUE;
        System.out.println("secondLargest:"+secondLargest);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
                System.out.println("if_largest:"+largest);
                System.out.println("if_secondLargest:"+secondLargest);
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
                System.out.println("elseif_secondLargest:"+secondLargest);
            }
        }
        System.out.println("Second largest number in the array is: "+secondLargest);
    }
}
