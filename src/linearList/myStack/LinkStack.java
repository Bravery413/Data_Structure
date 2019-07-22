package linearList.myStack;


public class LinkStack<E> {
    private Node<E> top;
    private int size;

    public LinkStack() {
        top = null;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public boolean push(E e) {
        //因为链栈,不用判空,直接用参数实例化节点,栈长+1
        top = new Node(e, top);
        size++;
        return true;
    }

    public Node<E> peek() throws Exception {
        // 1.判断是否空栈,如果空抛异常;2.如果不空,输出top
        if (isEmpty()) {
            throw new Exception("栈空");
        } else {
            return top;
        }
    }

    public Node<E> pop() throws Exception {
        // 1.判断是否栈空,如果空,抛异常;
        // 2.如果不空,声明top为node,将top指向下一节点.栈长-1,输出node
        if (isEmpty()) {
            throw new Exception("栈空");
        } else {
            Node<E> node = top;
            top = top.next;
            node.next = null;
            size--;
            return node;
        }
    }

    public int search(E e) throws Exception {
        Node<E> t = top;
        int i = 0;
        while (top != null) {
            if (top.e.equals(e)){
                break;
            }else {
                pop();
                i++;
            }
        }
        top=t;
        return i;
    }
}
