package linearList.myStack;

public class Stack<E> {
    private Object[] data = null;
    private int maxSize = 0;
    private int top = -1;

    public Stack() {
        this(10);
    }

    public Stack(int initialSize) {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            this.top = -1;
        }
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }


    public boolean push(E e) throws Exception {
        if (top == maxSize - 1) {
            throw new Exception("栈满,入栈错误");
        } else {
            top++;
            data[top] = e;
            return true;
        }
    }

    public E peek() throws Exception {
        if (top == -1) {
            throw new Exception("栈空");
        }
        return (E) data[top];
    }

    public E pop() throws Exception {
        if (top == -1) {
            throw new Exception("栈空");
        }
        return (E) data[top--];//先返回data[top] 在top--
    }

    public int search(E e) throws Exception {
        int i = top;
        while (top != -1) {
            if (peek() != e) {
                top--;
            } else {
                break;
            }
        }
        int result = top + 1;
        top = i;//返回值去
        return result;
    }


}
