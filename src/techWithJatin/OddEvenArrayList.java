package techWithJatin;

import java.util.ArrayList;

public class OddEvenArrayList {
	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add("Java");
		al.add(24);
		al.add(7);
		al.add(10);
		al.add(15);
		al.add(null);

		ArrayList<Integer> oddList = new ArrayList<>();
		ArrayList<Integer> evenList = new ArrayList<>();

		for (Object o : al) {

			if (o instanceof Integer) {
				int num = (Integer) o;

				if (num % 2 == 0) {
					evenList.add(num);
				} else {
					oddList.add(num);
				}
			}
		}

		System.out.println("Original List: " + al);
		System.out.println("Odd List: " + oddList);
		System.out.println("Even List: " + evenList);
	}

}
