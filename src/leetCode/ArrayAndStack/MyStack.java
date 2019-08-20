package leetCode.ArrayAndStack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bravery
 * @create: 2019-08-20 20:49
 **/


// "static void main" must be defined in a public class.

/**
 * 栈:
 * 方法有:判空isEmpty(),入栈push(),出栈pull(),输出栈顶元素pop()
 */


public class MyStack {
    private List<Integer> data;               // store elements
    public MyStack() {
        data = new ArrayList<>();
    }
    /** Insert an element into the stack. */
    public void push(int x) {
        data.add(x);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return data.isEmpty();
    }
    /** Get the top item from the queue. */
    public int top() {
        return data.get(data.size() - 1);
    }
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean pop() {
        if (isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }
};
