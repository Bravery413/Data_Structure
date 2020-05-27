package leetCode.InterviewWithGolden;

import java.util.Stack;

/**
 * 请设计一个栈，除了常规栈支持的pop与push函数以外，
 * 还支持min函数，
 * 该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。
 *
 * 利用一个栈存最小值
 */
public class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> minStack ;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack=new Stack();
        minStack=new Stack<>();
    }

    public  void push(int x) {
        if (minStack.size()==0||minStack.peek() >= x) minStack.push(x);
        stack.push(x);
    }

    public  void pop() {
        if (stack.peek() == minStack.peek()) minStack.pop();
        stack.pop();
    }

    public  int top() {
        return stack.peek();
    }

    public  int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

    }
}
