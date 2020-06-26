package leetcode.InterviewWithGolden;

/**
 * 编写一个函数，检查输入的链表是否是回文的。
 * 示例 1：
 * 输入： 1->2
 * 输出： false
 * 示例 2：
 * 输入： 1->2->2->1
 * 输出： true
 */
public class Solution0206 {
    /**
     * 创建一个新的反转链表,如果两者相等 则是回文的
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode temp = head.next;
        ListNode newList = new ListNode(head.val);
        while (temp != null) {
            ListNode cur = new ListNode(temp.val);
            cur.next = newList;
            newList = cur;
            temp = temp.next;
        }
        while (head != null) {
            if (newList.val != head.val) return false;
            newList = newList.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(isPalindrome(l1));

    }
}
