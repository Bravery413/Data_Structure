package linearList.myQueue;

public class Node<E> {
    public E e;
    public Node<E> next;
    public Node(){

    }
    public Node(E e,Node next){
        this.e=e;
        this.next=next;
    }

}
