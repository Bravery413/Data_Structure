import linearList.myQueue.ArrayQuene;
import linearList.myQueue.LinkQuene;
import linearList.myQueue.LoopQuene;
import linearList.myQueue.Node;

public class MainTest {
    public static void main(String[] args) throws Exception {
        LinkQuene<Object> quene = new LinkQuene<>();
        for (int i = 0; i < 10; i++) {
            quene.add(i);
        }
        System.out.println(quene.toString());
        System.out.println(quene.isEmpty());
        System.out.println(quene.peek());
        System.out.println(quene.length());

        for (int i = 0; i < 10; i++) {
            Node<Object> node = quene.poll();
            Object o=node.e;
            System.out.print(o.toString() + " ");
        }


    }
}
