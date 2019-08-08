import linearList.myQueue.ArrayQuene;
import linearList.myQueue.LinkQuene;
import linearList.myQueue.LoopQuene;
import linearList.myQueue.Node;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void method(String param) {
        switch (param) {
            case "sth":
                System.out.println("sth");
                break;
            case "null":
                System.out.println("it's null");
                break;
            case "":
                System.out.println("空字符串");
                break;
            default:
                System.out.println("default");
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println(String.format("%8f",(double)1/(double)3));


//
//        Integer a = 20;
//        Integer b = 20;
//        Integer c = 256;
//        Integer d = 256;
//        System.out.println(a == b);
//        System.out.println(c == d);

//        LinkQuene<Object> quene = new LinkQuene<>();
//        for (int i = 0; i < 10; i++) {
//            quene.add(i);
//        }
//        System.out.println(quene.toString());
//        System.out.println(quene.isEmpty());
//        System.out.println(quene.peek());
//        System.out.println(quene.length());
//
//        for (int i = 0; i < 10; i++) {
//            Node<Object> node = quene.poll();
//            Object o=node.e;
//            System.out.print(o.toString() + " ");
//        }


    }
}
