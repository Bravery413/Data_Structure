//package linearList.myQueue;
//
//import linearList.LinkList;
//
//public class LinkQuene<E> {
//    private Node front;//队列头,出
//    private Node rear;//队列尾,入
//    private int size;
//    public LinkQuene(){
//        front=null;
//        rear=null;
//    }
//    public boolean isEmpty(){
//        return size==0;
//    }
//
//    public int length(){
//        return size;
//    }
//
//    public boolean add(E e){
//        if (isEmpty()){
//            front=new Node(e,null);
//            rear=front;
//        }else {
//            Node<E> newNode = new Node<>(e, null);
//            rear.next=newNode;
//            rear=newNode;
//        }
//        size++;
//        return true;
//    }
//    public Node<E> peek() throws Exception {
//        if (isEmpty()) {
//            throw new Exception("队列空");
//        } else {
//            return front;
//        }
//    }
//    public Node<E> poll() throws Exception {
//        if (isEmpty()){
//            throw new Exception("队列空");
//        }else {
//            Node<E> node=front;
//            front=front.next;
//            node.next=null;
//            size--;
//            return node;
//        }
//    }
//
//
//}
