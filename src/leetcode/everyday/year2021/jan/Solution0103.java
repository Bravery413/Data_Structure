package leetcode.everyday.year2021.jan;

import leetcode.ListNode;

/**
 * @author: Bravery
 * @create: 2021-01-03 22:22
 **/


public class Solution0103 {
    public ListNode partition(ListNode head, int x) {
        ListNode cur = head;
        ListNode smaller;
        ListNode bigger;
        ListNode smallHead = smaller;
        ListNode bigHead = bigger;
        while (cur != null) {
            ListNode node = new ListNode(cur.val);
            if (cur.val > x) {
                bigger = node;
                bigger = bigger.next;
            } else {
                smaller = node;
                smaller = smaller.next;
            }
        }
   
        return res;
    }`
}
