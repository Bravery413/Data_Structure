package offer;

/**
 * 链表中倒数第k个节点
 */
public class Question18 {
    /**
     * 双指针
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail1(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            return null;
        }
        ListNode pre = head;
        ListNode last = head;
        for (int i = 1; i < k; i++) {
            if (pre.next == null) {
                return null;
            }
            pre = pre.next;
        }
        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;
    }

    /**
     * ,遍历一次知道链表长度,再遍历一次也行
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            return null;
        }
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        if (k > size) {
            return null;
        }
        cur = head;
        for (int i = 0; i < size - k; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = FindKthToTail(listNode1, 2);
        System.out.println(listNode.val);
    }
}
