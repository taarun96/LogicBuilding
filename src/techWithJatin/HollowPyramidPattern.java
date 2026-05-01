package techWithJatin;

public class HollowPyramidPattern {

	public static void main(String[] args) {

		int totalNumberOfRows = 5;

		for (int row = 1; row <= totalNumberOfRows; row++) {

			for (int col = 1; col <= row; col++) {
				// Logic: Print number only for the first column,
				// the last column (col == row), or the entire last row.
				if (col == 1 || col == row || row == totalNumberOfRows) {
					System.out.print(col);
				} else {
					// Print space for the 'hollow' part of the pyramid
					System.out.print(" ");
				}
			}
			// Move to the next line after each row is printed
			System.out.println();
		}

	}

}