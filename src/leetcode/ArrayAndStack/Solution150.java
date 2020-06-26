package leetcode.ArrayAndStack;

import java.util.Stack;

/**
 * @author: Bravery
 * @create: 2019-08-20 22:21
 **/


public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c:tokens) {
            if (c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if (c.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }else if (c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if (c.equals("/")){
                int num=stack.pop();
                stack.push(stack.pop()/num);
            }else {
                stack.push(Integer.valueOf(c));
            }
        }
        return stack.pop();
    }
}
