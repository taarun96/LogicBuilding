package techWithJatin;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {

		String input = "()())";
		System.out.println(checkParanthesis(input));
	}

	private static boolean checkParanthesis(String input) {
		// TODO Auto-generated method stub
		char inputArray[] = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
	
		for (char currentChar : inputArray) {
			if (currentChar == '(') {
				stack.push(currentChar);
			} else {
				if (currentChar == ')') {
					if (stack.isEmpty()) {
						return false; // mismatch occured! No opening bracket present!
					} else {
						char topchar = stack.pop();
						if (topchar != '(') {
							return false;
						}
					}
				}
			}
		}
		return stack.isEmpty();
	}

}
