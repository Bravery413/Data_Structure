package offer;

/**
 * 反转链表:
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Question19 {
    /**
     * 显示复杂度过高,不知道为什么
     *
     * @param head
     * @return
     */
    public static ListNode ReverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode resHead = null;
        //必须先把头指针的下一个节点先保存,不然传的是引用,会让pre为空
        ListNode pre = head.next;
        ListNode cur = head;
        //把第一个指针指向null,不然会成环
        cur.next = null;

        while (pre != null) {
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;

        }
        return cur;
    }

    /**
     * 通过的代码
     *
     * @param head
     * @return
     */
    public static ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null)
                newHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return newHead;
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

        ListNode listNode = ReverseList1(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
