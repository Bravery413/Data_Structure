package leetCode.InterviewWithGolden;

/**
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果。
 * 示例：
 *
 * 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
 * 输出：2 -> 1 -> 9，即912
 */
public class Solution0205 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        int pre = 0;
        while (l1 != null || l2 != null || pre > 0) {
            int temp = pre;
            if (l1 != null) temp += l1.val;
            if (l2 != null) temp += l2.val;
            if (temp >= 10) {
                pre = 1;
            } else {
                pre = 0;
            }
            p.next = new ListNode(temp % 10);
            p = p.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(2);
        l4.next = l5;
        l5.next = l6;
        ListNode listNode = addTwoNumbers(l1, l4);
        System.out.println(listNode);
    }
}
