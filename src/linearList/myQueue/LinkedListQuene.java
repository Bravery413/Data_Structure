package linearList.myQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQuene<E> {
    private Queue<E> queue = new LinkedList<E>();

    public boolean add(E e){
        return queue.add(e);
    }
    public E peek(){
        return queue.peek();
    }
    public E remove(){
        return queue.remove();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }


}
