package linearList.myQueue;

import java.util.Arrays;

/**
 * 循环队列 移动指针,不用移动元素
 *
 * @param <E>
 */
public class LoopQuene<E> {
    public Object[] data = null;
    private int maxSize;
    private int rear;
    private int front;
    private int size;//可以用(rear+1)/maxSize

    public LoopQuene() throws Exception {
        this(10);
    }

    public LoopQuene(int initialSize) throws Exception {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            front = rear = 0;
        } else {
            throw new Exception("初始化队列长度不能小于0");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void clear() {
        Arrays.fill(data, null);
        size = 0;
        front = 0;
        size = 0;
    }

    public boolean add(E e) throws Exception {
        if (size == maxSize) {
            throw new Exception("入队失败,栈满");
        } else {
            data[rear] = e;
            rear = (rear + 1) % maxSize;
            size++;
            return true;
        }
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("栈空");
        } else {
            return (E) data[front];
        }
    }

    public E poll() throws Exception {
        if (isEmpty()) {
            throw new Exception("栈空");
        } else {
            E e = (E) data[front];
            data[front] = null;
            front = (front + 1) % maxSize;
            size--;
            return e;
        }
    }


}
