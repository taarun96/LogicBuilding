package techWithJatin;

public class ValidParanthesis2 {

	public static void main(String[] args) {
		String[] tests = {
			"a)b(c)d",
			")))(",
			"abc))",
			"abc))" // duplicate as in examples
		};

		for (String t : tests) {
			System.out.println("Input:  \"" + t + "\"");
			System.out.println("Output: \"" + minRemoveToMakeValid(t) + "\"");
			System.out.println();
		}
	}

	/**
	 * Remove the minimum number of parentheses to make the input string valid.
	 * Uses a two-pass algorithm: first remove unmatched ')' while building a buffer,
	 * then remove extra '(' from the end.
	 */
	public static String minRemoveToMakeValid(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder();
		int open = 0;

		// First pass: keep valid ')' by tracking open count, skip unmatched ')'
		for (char c : s.toCharArray()) {
			if (c == '(') {
				open++;
				sb.append(c);
			} else if (c == ')') {
				if (open > 0) {
					open--;
					sb.append(c);
				} // else skip unmatched ')'
			} else {
				sb.append(c);
			}
		}

		// Second pass: remove unmatched '(' from the end
		if (open > 0) {
			StringBuilder result = new StringBuilder();
			for (int i = sb.length() - 1; i >= 0; i--) {
				char c = sb.charAt(i);
				if (c == '(' && open > 0) {
					open--; // skip this unmatched '('
					continue;
				}
				result.append(c);
			}
			return result.reverse().toString();
		}

		return sb.toString();
	}

}
