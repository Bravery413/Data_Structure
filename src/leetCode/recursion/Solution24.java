package leetCode.recursion;

/**
 * @author: Bravery
 * @create: 2019-09-13 17:56
 **/


public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

}
