package leetCode;



public class Solution21 {
    //递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        //保证自己串头还在
//        其实就是把l1,l2串在这里
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}

/**
 * 总结
 * 时间复杂度O(n+m)空间复杂度O(1)
 * 链表复习,1.初始化链表,插入,结构等
 * 注意:构造一个链表需要有个不变的头指针+尾指针,尾指针不停在后面加,头指针还可以整个提起来
 *
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

