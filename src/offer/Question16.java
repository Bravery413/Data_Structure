package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class Question16 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        ListNode cur = listNode;
        while (cur != null) {
            System.out.println(cur.val);
            stack.push(cur.val);
            cur = cur.next;
        }

        while (stack.size() > 0) {
            Integer pop = stack.pop();
            res.add(pop);
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        while (listNode1 != null) {

            System.out.println(listNode1.val);
            stack.push(listNode1.val);
            listNode1 = listNode1.next;
        }
        System.out.println("stack value-----");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }


    }
}

