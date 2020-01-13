package leetCode.LinkNode;

/**
 * @author: Bravery
 * @create: 2019-09-19 09:31
 **/


public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
