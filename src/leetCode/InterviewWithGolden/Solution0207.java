package leetCode.InterviewWithGolden;

public class Solution0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lenA = 0, lenB = 0;
        while (nodeA != null) {
            lenA++;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            lenB++;
            nodeB = nodeB.next;
        }
        int desc;
        nodeA = headA;
        nodeB = headB;
        if (lenA > lenB) {
            desc = lenA - lenB;
            while (desc > 0) {
                nodeA = nodeA.next;
                desc--;
            }
        } else {
            desc = lenB - lenA;
            while (desc > 0) {
                nodeB = nodeB.next;
                desc--;
            }
        }
        while (nodeA != null) {
            if (nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }
}
