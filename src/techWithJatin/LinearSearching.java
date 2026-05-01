package techWithJatin;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,5,40,50};
		int key=5;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index: "+index);
		}

	}

}
