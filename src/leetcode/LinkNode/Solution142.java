package leetcode.LinkNode;

import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/30 15:17
 */
public class Solution142 {
    //
    public ListNode detectCycle(ListNode head) {
        //TODO 写到这
        if (head==null||head.next==null){
            System.out.println("no cycle");
        }
        HashSet<Integer> visited = new HashSet<>();
//        ListNode node=head;
//        while (node!=null){
//            if (visited.contains(node)){
//                return node;
//            }
//        }
        return null;
    }
}
