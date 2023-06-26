package algorithms.chapterone.c1.bagsandqueues;


import java.util.List;
import java.util.Stack;

/**
 * 1.3.1
 * Add a method isFull() to FixedCapacityStackOfStrings.
 */
public class Exercise_1_3_04 {

    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {
        List<String> inputs = List.of("[()]{}{[()()]()}", "(()(()))", "()()()()", "(()()())", ")()(()))", "())(()(", ")()()()");
        for (String input : inputs) {
            validate(input);
        }
    }

    private static void validate(String input) {

        for (char c : input.toCharArray()) {
            if(((c == ')') || c=='}' || c==']') && stack.isEmpty()){
                System.out.println(String.format("%s is not valid", input));
                break;
            }else if(((c == ')' && stack.peek() == '(') || (c=='}' && stack.peek()=='{')|| (c==']' && stack.peek()=='['))){
                    stack.pop();

            }else {
                stack.push(c);
            }

        }
    }
}
