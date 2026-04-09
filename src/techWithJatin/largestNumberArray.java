package techWithJatin;

public class largestNumberArray {
    public static void main(String[] args) {
        int arr[]={10,20,5,30,15};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest number in the array is: "+largest);

    }
}
