package algorithms.chapterone;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * User: Nabeel Bhatti
 * Date: 22/06/2023
 */
public class CreateInfixExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression without left parentheses: ");
        String input = scanner.nextLine();
        String infixExpression = addParentheses(input);
        System.out.println("Infix expression with parentheses: " + infixExpression);


    }

    public static String addParentheses(String expression) {
        Stack<String> operators = new Stack<>();
        Stack<String> operands = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                operands.push(Character.toString(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                operators.push(Character.toString(c));
            } else if (c == ')') {
                String op2 = operands.pop();
                String operator = operators.pop();
                String op1 = operands.pop();
                StringBuilder evaluated = new StringBuilder();
                evaluated.append("( ").append(op1).append(" ").append(operator).append(" ").append(op2).append(" )");
                operands.push(evaluated.toString());
            }
        }
        return operands.pop();
    }
}
