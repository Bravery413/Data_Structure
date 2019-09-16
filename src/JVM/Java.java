package JVM;

import java.util.Stack;

/**
 * @author: Bravery
 * @create: 2019-09-16 09:57
 **/


public class Java {
    private static int stackLength=1;
    public static void stackLeak(){
        stackLength++;
        stackLeak();
        
    }
    public static void main(String[] args) {
        try {
            stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+ Java.stackLength);
            throw e;
        }
    }
    //java堆溢出

}
