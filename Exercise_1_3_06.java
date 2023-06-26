package algorithms.chapterone.c1.bagsandqueues;


import java.util.List;
import java.util.Stack;

/**
 * 1.3.1
 * Add a method isFull() to FixedCapacityStackOfStrings.
 */
public class Exercise_1_3_06 {
/**
 * Stack<String> stack = new Stack<String>();
 * while (!q.isEmpty())
 * stack.push(q.dequeue());
 * while (!stack.isEmpty())
 * q.enqueue(stack.pop());
 * this piece of code reverse the queue order assume you have a queue and you enqueue following sequence
 * 4 3 2 1 with right earliest
 * now if you dequeue elements until queue is not empty and push to stack order will be 1 2 3 4 with right most on top
 * now if we pop the elements of stack and enqueue again in queue order will be reversed 1 2 3 4 with 4 the earliest one opposite to the initial order
 */
}
