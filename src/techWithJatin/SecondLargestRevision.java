package techWithJatin;

public class SecondLargestRevision {
	
	
	public static void main(String[] args) {
		int num[] = {10, 20, 5, 30, 2, 50, 40};

		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for (int n : num) {
		    if (n > max) {
		        secondmax = max;
		        max = n;
		    } else if (n > secondmax && n != max) {
		        secondmax = n;
		    }
		}

		System.out.println("Second largest: " + secondmax);
	}

}
