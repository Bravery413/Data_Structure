package offer;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 */
public class Question31 {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty() ? true : false;
    }

    public static void main(String[] args) {

    }

}
