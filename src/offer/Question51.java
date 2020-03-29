package offer;

public class Question51 {
    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null){
            return null;
        }
        // 1.复制链表节点
        RandomListNode head=pHead;
        while (pHead.next!=null){
            RandomListNode next=pHead.next;
            pHead.next=new RandomListNode(pHead.label);
            pHead=pHead.next;
            pHead.next=next;
            pHead=pHead.next;
        }



        // 2.赋值random指针
        // 3.拆分链表,奇数是原来的,偶数是res




        return null;
    }

    public static void main(String[] args) {

    }
}
