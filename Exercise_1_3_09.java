package algorithms.chapterone.c1.bagsandqueues;

import java.util.Stack;

public class Exercise_1_3_09 {
    public static void main (String[] args) {
        // Sample input
        String input = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String[] items = input.split("\\s");

        // Stacks
        Stack<String> operands = new Stack<String>();
        Stack<String> operators = new Stack<String>();

        // Output
        for (String item : items) {
            if (item.equals(")")) {
                String s3 = operands.pop();
                String s2 = operators.pop();
                String s1 = operands.pop();
                operands.push("( " + s1 + " " + s2 + " " + s3 + " )");
            }
            else if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                operators.push(item);
            }
            else {
                operands.push(item);
            }
        }
        System.out.println(operands);


    }
}
