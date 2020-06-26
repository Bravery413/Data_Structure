package leetcode;

/**
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * 可以快速排序,可以归并排序
 */
//TODO 学习
public class Solution148 {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        ListNode head=node;

        head.next=new ListNode(5);
        head=head.next;
        head.next=new ListNode(1);
        head=head.next;
        head.next=new ListNode(9);
        head=head.next;

        ListNode sortList = sortList(node);
        while (sortList!=null){
            System.out.println(sortList.val);
            sortList=sortList.next;
        }
    }
}
