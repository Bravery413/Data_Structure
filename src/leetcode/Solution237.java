package leetcode;


/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，
 * 你将只被给定要求被删除的节点。
 */
public class Solution237 {
    //给定了已经指向那个节点,而且是不用考虑是最后一个节点
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

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
        ListNode target = new ListNode(5);
        deleteNode(target);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
}
