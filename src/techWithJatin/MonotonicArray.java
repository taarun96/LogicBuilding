package techWithJatin;

public class MonotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		boolean increasing = true;
		boolean decreasing = true;

		for (int i = 1; i < a.length; i++) {
		    if (a[i - 1] < a[i]) {
		        decreasing = false;
		    } else if (a[i - 1] > a[i]) {
		        increasing = false;
		    }
		}

		if (increasing || decreasing) {
		    System.out.println("The given array is monotonic");
		}
		else
		{
			System.out.println("The given array is not monotonic");
		}
	}

}
