package leetcode.InterviewWithGolden;

/**
 * 移除未排序链表中的重复节点。保留最开始出现的节点。
 * 提示：
 *
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * 进阶：
 *
 * 如果不得使用临时缓冲区，该怎么解决？
 */
public class Solution0201 {

    /**
     * 用位图法替代哈希
     * @param head
     * @return
     */
    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null ) return null;
        ListNode cur = head;
        ListNode next = head.next;
        boolean[] flag = new boolean[20001];
        flag[cur.val] = true;
        while (next != null) {
            if (!flag[next.val]){
                flag[next.val]=true;
                cur=next;
                next=next.next;
            }else {
                next=next.next;
                cur.next=next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
