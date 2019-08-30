import linearList.myQueue.ArrayQuene;
import linearList.myQueue.LinkQuene;
import linearList.myQueue.LoopQuene;
import linearList.myQueue.Node;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

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
        int test=159;
        Stack<Integer> stack = new Stack<>();
        while (true){
            if (test/10==0){
                stack.push(test);
                break;
            }
            stack.push(test%8);
            test=test/8;
        }
        for (Integer m:stack){
            System.out.println(m);
        }
    }
}
