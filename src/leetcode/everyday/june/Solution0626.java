package leetcode.everyday.june;

import java.util.HashSet;

/**
 * @author 潘勇
 * @date 2020/6/26 9:15
 * 面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * 示例1:
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 * 示例2:
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 * 提示：
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * 进阶：
 * 如果不得使用临时缓冲区，该怎么解决？
 */
public class Solution0626 {
    /**
     * hash方法 时间复杂度和空间复杂度都是O(n)
     * 步骤常见
     *
     * @param head 问题头结点
     * @return 答案头结点
     */
    public static ListNode removeDuplicateNodes0(ListNode head) {
        if (head == null) {
            return null;
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
     * 使用双重循环,把当前节点后的全部相同节点删除,空间复杂度O(1),时间复杂度O(n^2)
     *
     * @param head 问题头结点
     * @return 答案头结点
     */
    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
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
     *
     * @param head 问题头结点
     * @return 答案头结点
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