package techWithJatin;

import java.util.Stack;

public class ReverseStringStack {
public static void main(String[] args) {
        
        String input = "Hello";
        char dataArray[] = input.toCharArray();
        
        Stack<Character> stack = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        StringBuilder actualResult = new StringBuilder();
        // Step 1: Pushing all characters onto the stack
        for (char data : dataArray) {
            stack.push(data);
            actualResult.append(data);
        }
        
        // Step 2: Popping characters from the stack (retrieves them in reverse order)
        while (!stack.isEmpty()) {
            char poppedItem = stack.pop();
            result.append(poppedItem);
        }
        
        System.out.println("OriginalString:"+actualResult);
        // Output: olleH
        System.out.println("Reversed String:"+result);
    }
}
