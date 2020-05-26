package leetCode.InterviewWithGolden;
/**
 * 编写程序以 x 为基准分割链表，使得所有小于 x 的节点排在大于或等于 x 的节点之前。
 * 如果链表中包含 x，x 只需出现在小于 x 的元素之后(如下所示)。
 * 分割元素 x 只需处于“右半部分”即可，其不需要被置于左右两部分之间。
 * 示例:
 * 输入: head = 3->5->8->5->10->2->1, x = 5
 * 输出: 3->1->2->10->5->5->8
 */
public class Solution0204 {
    /**
     * 利用头尾插法,小于的放前面,大于等于的在后面
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode pre = head;
        ListNode tail = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val >= x) {
                tail = cur;
                cur = cur.next;
            } else {
                tail.next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tail.next;
            }
        }
        return pre;
    }

    /**
     * 遍历链表 按大小分组 再连接,效率低
     * @param head
     * @param x
     * @return
     */
    public ListNode partition1(ListNode head, int x) {
        if (head == null) return null;
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode smallHead = small;
        ListNode bigHead = big;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            if (head.val < x) {
                small.next = node;
                small=small.next;
            } else {
                big.next = node;
                big=big.next;
            }
            head=head.next;
        }
        small.next = bigHead.next;
        return smallHead.next;
    }
}
