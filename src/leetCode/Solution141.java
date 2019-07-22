package leetCode;

import java.util.HashSet;

/**
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 */
public class Solution141 {
    //用哈希保存节点地址,一旦重复返回结果
    public static boolean hasCycle0(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
    //快慢指针
    // 思路:
    // 1. 这个是一旦快指针指到慢指针一样,那么就有重
    //TODO 疑问, 因为快指针永远多格,慢指针1格有没可能永远都相遇不到,而是超越
    public static boolean hasCycle(ListNode head) {
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (slow!=fast){
            if (fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode head = node;

        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        ListNode temp = head;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        head = head.next;
        head.next = temp;
        System.out.println(hasCycle(node));

//        while (node != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
    }
}
