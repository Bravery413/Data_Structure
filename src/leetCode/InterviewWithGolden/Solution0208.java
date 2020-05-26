package leetCode.InterviewWithGolden;

/**
 * 给定一个有环链表，实现一个算法返回环路的开头节点。
 * 有环链表的定义：在链表中某个节点的next元素指向在它前面出现过的节点，则表明该链表存在环路。
 */
public class Solution0208 {
    /**
     * 利用数学方法 快慢指针,找到重合的点后
     * 其中一个指针回到原点,各走一步,相遇就是入口
     * @param head
     * @return
     */
    public ListNode detectCycle1(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
