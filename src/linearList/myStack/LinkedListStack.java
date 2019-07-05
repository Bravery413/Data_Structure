package linearList.myStack;


import java.util.LinkedList;

public class LinkedListStack<E> {
    private LinkedList<E> stack = new LinkedList();

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void push(E e){
        stack.addFirst(e);
    }
    public E peek(){
        return stack.getFirst();
    }
    public E pop(){
        return stack.removeFirst();
    }
    public String toString(){
       return stack.toString();
    }




}
