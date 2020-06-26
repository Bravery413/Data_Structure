package leetcode.ArrayAndStack;

import java.util.Stack;

/**
 * @author: Bravery
 * @create: 2019-08-20 21:01
 **/

/**
 * 155 最小栈
 */

 public class MinStack {
     private Stack<Integer> data;
     private Stack<Integer> helper;
    /** initialize your data structure here. */
    public MinStack() {
        data=new Stack<>();
        helper=new Stack<>();
    }

    public void push(int x) {
        data.add(x);
        if (helper.isEmpty()||helper.peek()>=x){
            helper.add(x);
        }else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()){
            data.pop();
            helper.pop();
        }
    }

    public int top() {
        if (!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("栈空");
    }

    public int getMin() {
        if (!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("栈空");
    }
}