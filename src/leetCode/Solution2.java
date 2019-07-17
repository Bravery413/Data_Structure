package leetCode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */


public class Solution2 {
    /**
     * 思路:
     * 1. 遍历,两个结点相加,*10
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode pre = listNode;
        while (l1 != null && l2 != null) {
            int value=l1.val + l2.val;
            if (value>=10){
                pre.val=value%10;

            }else {
                pre.val = l1.val + l2.val;
            }
            l1 = l1.next;
            l2 = l2.next;
            pre.next = new ListNode(0);
            pre = pre.next;
        }
        return listNode.next;
    }

    /**
     * 总结
     */
    public static void main(String[] args) {
        //链表有没有头结点的?
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
