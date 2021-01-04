package leetcode.everyday.year2021.jan;

import leetcode.everyday.year2020.june.ListNode;

/**
 * @author 潘勇
 * @date 2021/1/4 8:41
 */


public class Solution0103 {

    /**
     * 注意链表要有一个指针指向头结点，这里使用一个值为0的头结点，组合并输出时候需要注意
     * 最后一个定义为null，避免循环
     * @param head
     * @param x
     * @return
     */
    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode big = new ListNode(0);
        ListNode bigHead = big;
        while (head != null) {
            if (head.val > x) {
                big.next = head;
                big = big.next;
            } else {
                small.next = head;
                small = small.next;
            }
            head = head.next;
        }
        big.next = null;
        small.next = bigHead.next;
        return smallHead.next;
    }


}
