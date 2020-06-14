package leetCode.everyDayOneQuestion.march;


import javax.swing.plaf.IconUIResource;

public class Solution0302 {
    /**
     * 迭代
     *
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode last = head;
        if (last.next == null) {
            return last;
        }
        ListNode cur = last.next;
        if (cur.next == null) {
            cur.next = last;
            last.next = null;
            return cur;
        }
        ListNode pre = cur.next;
        last.next = null;
        while (cur != null) {
            cur.next = last;
            if (pre == null) {
                break;
            }
            last = cur;
            cur = pre;
            pre = pre.next;
        }
        return cur;
    }

    /**
     * 迭代改进写法;
     *
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        ListNode last = null;
        ListNode cur = head;
        ListNode pre ;
        while (cur != null) {
            pre = cur.next;
            cur.next=last;
            last = cur;
            cur = pre;
        }
        return last;
    }

    /**
     * 递归
     * @param args
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode listNode = reverseList(n1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
