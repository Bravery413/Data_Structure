package leetcode.ArrayAndStack;

import java.util.Stack;

/**
 * @author bravery
 * @date 2019/8/21 8:03
 */

/**
 * 思路:
 * 进栈直接进栈1
 * 出栈时候,如果栈2没空,直接出,如果栈空 把栈1全部弄进来再出
 */
class MyQueue {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stackPop = new Stack<Integer>();
        stackPush = new Stack<Integer>();

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stackPush.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stackPop.empty()){
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stackPop.empty()){
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();


    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (stackPop.empty() && stackPush.empty())
            return true;
        return false;
    }
}
