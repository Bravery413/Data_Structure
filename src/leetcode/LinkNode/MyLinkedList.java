package leetcode.LinkNode;

/**
 * @author bravery
 * @date 2019/8/30 14:17
 */
public class MyLinkedList {
    /**
     * 设计链表的实现。您可以选择使用单链表或双链表。
     * 单链表中的节点应该具有两个属性：val 和 next。v
     * al 是当前节点的值，next 是指向下一个节点的指针/引用。
     * 如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。
     * 假设链表中的所有节点都是 0-index 的。
     *
     * 在链表类中实现这些功能：
     * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
     * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。
     *      插入后，新节点将成为链表的第一个节点。
     * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
     * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。
     *      如果 index 等于链表的长度，则该节点将附加到链表的末尾。
     *      如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
     * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
     */

    /**
     * 注意分情况想一想 中间 ,头和尾有什么区别,要做什么变化
     */

    /**
     * -----------------------------------------------------------------------------------
     */

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node node, head, tail;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        Node p = new Node(0);
        this.head = p;
        this.tail = p;
        this.size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= this.size) {
            return -1;
        } else {
            Node cur = this.head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (this.size == 0) {
            this.head.val = val;
        } else {
            Node newHead = new Node(val);
            newHead.next = this.head;
            this.head = newHead;
        }
        this.size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (this.size == 0) {
            this.tail.val = val;
        } else {
            Node newTail = new Node(val);
            this.tail.next = newTail;
            this.tail = newTail;
        }
        this.size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > this.size) {
            return;
        } else if (index <= 0) {
            addAtHead(val);
        } else if (index == this.size) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node cur = this.head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            this.size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < this.size) {
            if (index == 0) {
                this.head = this.head.next;
            } else {
                Node cur = this.head;
                for (int i = 0; i < index - 1; i++) {
                    cur = cur.next;
                }
                cur.next = cur.next.next;
                if (index == this.size - 1) {
                    tail = cur;
                }
            }
            this.size--;
        }
    }


}
