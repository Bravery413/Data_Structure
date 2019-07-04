package linearList;

public class LinkList implements MyList {
    private Node head;

    public LinkList() {
        head = new Node();
    }

    @Override
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }

    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public int length() {
        // 1.得到长度需要遍历链表  注:也可在头结点node存放length,每次插入/删除更新头结点length
        Node node = head.getNext();
        int length = 0;
        while (node != null) {
            node = node.getNext();
            ++length;
        }
        return length;
    }

    @Override
    public Object get(int i) throws Exception {
        // 1.获取头结点,遍历链表;
        // 2.如果存在返回节点,如果不存在,报错
        Node node = head.getNext();
        int j = 0;
        Object data = head.getData();
        while (node != null && j < i) {
            node = node.getNext();
            ++j;
        }
        if (j > i || node == null) {
            throw new Exception("元素不存在");
        }
        return node.getData();
    }

    @Override
    public void insert(int i, Object obj) throws Exception {
        // 1.获取头结点,遍历到位置i;
        // 2.判断节点是否存在;
        // 3.如果存在: 1创建一个新节点;2.新节点的next设置为i位置节点的next;3.i位置节点的next设置为新节点
        // 注:2 3顺序不能变,否则链断了
        Node node = head;
        int j = -1;
        while (node != null && j < i - 1) {//取i之前的一个,放在i-1后面所以插入到位置
            node = node.getNext();
            ++j;
        }
        if (j > i - 1 || node == null)
            throw new Exception("插入位置不合法");
        Node newNode = new Node(obj);
        newNode.setNext(node.getNext());
        node.setNext(newNode);
    }

    @Override
    public void remove(int i) throws Exception {
        // 1.获得头结点,获得i之前的节点;
        // 2.1 如果不存在报错;
        // 2.2如果存在设置i之前的节点指向的i结点的下一个节点
        Node node = head;
        int j = -1;
        while (node.getNext() != null && j < i - 1) {
            node = node.getNext();
            ++j;
        }
        if (j > i - 1 || node == null)
            throw new Exception("删除位置不合法");
        node.setNext(node.getNext().getNext());
    }

    @Override
    public int indexOf(Object obj) {
        // 1.获得头结点,遍历结点;
        // 2.如果有,输出,
        Node node = head.getNext();
        int j = 0;
        while (node != null && !node.getData().equals(obj)) {
            node = node.getNext();
            ++j;
        }
        if (node != null)
            return j;
        return -1;
    }

    @Override
    public void display() {
        // 1.获得头结点,遍历结点,输出
        Node node = head.getNext();
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        Node node = head.getNext();
        if (node == null)
            return null;
        while (node != null) {
            sb.append(node.getData().toString() + ", ");
            node = node.getNext();
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }


}
