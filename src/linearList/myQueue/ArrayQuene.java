package linearList.myQueue;

/**
 * 普通队列 每出一个需要移动元素效率太低
 * @param <E>
 */
public class ArrayQuene<E> {
    private Object[] data = null;
    private int maxSize;
    private int rear;

    public ArrayQuene() {
        this(10);
    }

    public ArrayQuene(int initialSize) {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            rear = 0;
        }
    }

    public boolean isEmpty() {
        return 0 == rear ? true : false;
    }

    public int length() {
        return rear;
    }

    public boolean add(E e) throws Exception {
        if (rear >= maxSize) {
            throw new Exception("队列满,插入错误");
        } else {
            data[rear] = e;
            rear++;
            return true;
        }
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("队列空");
        } else {
            return (E) data[0];
        }
    }

    public E poll() throws Exception {
        if (isEmpty()) {
            throw new Exception("栈空");
        } else {
            Object obj = data[0];
            for (int i = 0; i < rear-1; i++) {
                data[i] = data[i + 1];
            }
            rear--;
            return (E) obj;
        }
    }


}
