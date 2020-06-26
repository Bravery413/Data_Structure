package leetCode.everyDayOneQuestion.june;

import java.util.HashSet;

/**
 * @author 潘勇
 * @date 2020/6/26 9:15
 */


public class Solution0626 {
    /**
     * hash方法 时间复杂度和空间复杂度都是O(n)
     *
     * @param head
     * @return
     */
    public static ListNode removeDuplicateNodes0(ListNode head) {
        if (head == null) {
            return head;
        }
        HashSet<Integer> nodes = new HashSet<>();
        ListNode last = head;
        ListNode cur = head.next;
        nodes.add(last.val);
        while (cur != null) {
            if (nodes.contains(cur.val)) {
                cur = cur.next;
                last.next = cur;
            } else {
                nodes.add(cur.val);
                last = last.next;
                cur = cur.next;
            }
        }
        return head;
    }

    /**
     * 使用双重循环,把当前节点后的全部相同节点删除,空间复杂度O(1),时间复杂度O(n)
     *
     * @param head
     * @return
     */
    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode root = head;
        while (root != null) {
            int val = root.val;
            ListNode after = root.next;
            ListNode pre = root;
            while (after != null) {
                if (after.val == val) {
                    after = after.next;
                    pre.next = after;
                } else {
                    pre = pre.next;
                    after = after.next;
                }
            }
            root = root.next;
        }
        return head;
    }

    /**
     * 使用位图法会效率最高,hash的本质
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes3(ListNode head) {
        boolean[] visited = new boolean[20001];
        ListNode h = new ListNode(-1);
        ListNode tmph = h;
        ListNode cur = head;
        while (cur != null) {
            if (!visited[cur.val]) {
                tmph.next = cur;
                tmph = cur;
                visited[cur.val] = true;
            }
            cur = cur.next;
        }
        tmph.next = null;
        return h.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        ListNode listNode = removeDuplicateNodes(n1);
        System.out.println(removeDuplicateNodes(listNode));

    }
}