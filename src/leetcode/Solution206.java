package leetcode;

import java.util.Stack;

/**
 * 反转一个单链表。
 *         示例:
 *         输入: 1->2->3->4->5->NULL
 *         输出: 5->4->3->2->1->NULL
 *         进阶:
 *         你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

public class Solution206 {
    //自己思路,利用栈实现,难点在于链表的语法操作,要有一个head指着头
    public static ListNode reverseList0(ListNode head) {
        ListNode pre=head;
        Stack<Integer> stack = new Stack<>();
        while (pre!=null){
            stack.push(pre.val);
            pre=pre.next;
        }
        pre=head;
        while (stack.size()!=0&&pre!=null){
            pre.val=stack.pop();
            pre=pre.next;
        }
        return head;
    }
    //迭代,更改指针
    //思路:
    // 1. 清楚必须有三个节点表示前中后
    // 2. 清楚步骤顺序:
    public static ListNode reverseList1(ListNode head) {
        //存储之前
        ListNode prev=null;
        //存储当前
        ListNode curr=head;
        while (curr!=null){
            //存贮当前的下一个
            ListNode nextTemp=curr.next;
            // 当前节点的下一个反向;改为之前的一个节点
            curr.next=prev;
            //定位前一个节点指针后移
            prev=curr;
            //当前节点为下一个
            curr=nextTemp;
        }
        return prev;
    }
    //递归,不懂
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode head=node;

        head.next=new ListNode(2);
        head=head.next;
        head.next=new ListNode(3);
        head=head.next;
        head.next=new ListNode(4);
        head=head.next;
        head.next=new ListNode(5);
        head=head.next;
        ListNode listNode = reverseList(node);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}
