package leetcode.InterviewWithGolden;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 说明：
 *
 * 给定的 k 保证是有效的。
 */
public class Solution0202 {
    /**
     * 注意如果k不一定有效 需加判断
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        ListNode pre = head;
        ListNode last = head;
        while (k > 0){
            k -= 1;
            pre = pre.next;
        }
        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last.val;
    }
}
