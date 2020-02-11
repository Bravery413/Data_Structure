package offer;

/**
 * 删除链表中重复的节点
 */
public class Question49 {


//    public ListNode deleteDuplication(ListNode pHead) {
//        if (pHead == null || pHead.next == null) {
//            return pHead;
//        }
//        ListNode last = new ListNode(-1);
//        ListNode cur = pHead.next;
//        ListNode pre=cur.next;
//        while (cur.val == pre.val) {
//            cur = pre;
//            pre = cur.next;
//        }
//        last=pre;
//
//            if (cur.val == pre.val) {
//
//               cur=pre.next;
//            } else {
//                last = last.next;
//                cur = cur.next;
//            }
//        }
////        return pHead;
//
//    }


    public ListNode deleteDuplication0(ListNode pHead){
        ListNode first = new ListNode(-1);//设置一个trick
        first.next = pHead;
        ListNode p = pHead;
        ListNode last = first;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                while (p!= null&&p.val == val)
                    p = p.next;
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }
}
