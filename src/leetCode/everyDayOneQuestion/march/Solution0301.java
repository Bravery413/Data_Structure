package leetCode.everyDayOneQuestion.march;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 */
public class Solution0301 {
    class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
        /** Initialize your data structure here. */
        public MyStack() {
            q1=new LinkedList<>();
            q2=new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            q1.offer(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while (q1.size()!=1){
                q2.offer(q1.remove());
            }
            int temp = q1.remove();
            while (q2.size()!=0){
                q1.offer(q2.remove());
            }
            return temp;
        }

        /** Get the top element. */
        public int top() {
            while (q1.size()!=1){
                q2.offer(q1.remove());
            }
            int temp = q1.remove();
            q2.offer(temp);
            while (q2.size()!=0){
                q1.offer(q2.remove());
            }
            return temp;

        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.size()==0?true:false;
        }
    }
}
