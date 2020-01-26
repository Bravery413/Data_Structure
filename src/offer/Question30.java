package offer;

import java.util.Iterator;
import java.util.Stack;

/**
 * 包含min函数的栈
 */
public class Question30 {

    private static Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
