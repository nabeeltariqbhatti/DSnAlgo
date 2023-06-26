package algorithms.chapterone.c1.bagsandqueues;

import java.util.Stack;

public class Exercise_1_3_13 extends Stack<String> {

    public  Stack<String> copy(Stack<String> stack){
        final Stack<String> copy = new Stack<>();
        final Stack<String> returning = new Stack<>();
        while (!this.isEmpty()){
            String pop = this.pop();
            copy.push(pop);
            returning.push(pop);
        }
        while (!copy.isEmpty()){
            this.push(copy.pop());
        }
        return returning;
    }
    public static void main (String[] args) {
        Exercise_1_3_13 stack = new Exercise_1_3_13();
        stack.push("hello");
        stack.push("bye");
        Stack<String> copy = stack.copy(stack);
        copy.pop();
        System.out.println(copy);
        System.out.println(stack);

    }
}
