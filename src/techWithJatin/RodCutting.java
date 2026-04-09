package techWithJatin;

import java.util.ArrayList;
import java.util.Arrays;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rods[] = {1, 1, 3, 4};

Arrays.sort(rods);

ArrayList<Integer> rodList = new ArrayList<Integer>();
ArrayList<Integer> result = new ArrayList<Integer>();

for (int rod : rods) {
    rodList.add(rod);
}

System.out.println(rodList);

while (!rodList.isEmpty()) {
    result.add(rodList.size());
    int shortest = rodList.get(0);

    ArrayList<Integer> next = new ArrayList<Integer>();

    for (int rod : rodList) {
        if (rod == shortest) {
            // discard!
        } else {
            next.add(rod - shortest); // 3 - 1
        }
    }

    rodList = next;
}

System.out.println(result);
	}

}
