package newCoder;

import leetcode.ListNode;

/**
 * @author: Bravery
 * @create: 2019-09-19 09:05
 **/


class Solution {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp=curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(7890));
    }
}
