package algorithms.chapterone.c1.bagsandqueues;


/**
 * 1.3.1
 * Add a method isFull() to FixedCapacityStackOfStrings.
 */
public class Exercise_1_3_01 {
    public static class FixedCapacityStackOfStrings {
        private int size = 0;
        private String[] stack = null;

        public FixedCapacityStackOfStrings(int i) {
            stack = new String[i];
        }

        public int getSize() {
            return size;
        }

        public void push(String element) {
            stack[++size] = element;
        }

        public String pop() {
            return stack[--size];
        }

        public boolean isFull() {
            return size== stack.length;
        }

    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        String[] items = {"to", "be", "or", "not", "to", "-", "be", "-", "-", "that", "-", "-", "-", "is"};
        for (String item : items) {
            if (!item.equals("-")) {
                if (!s.isFull()) s.push(item);
            } else if (s.getSize()>0) {
                System.out.println(s.pop());
            }
        }
    }
}
