package JVM;

import java.util.ArrayList;

/**
 * @author: Bravery
 * @create: 2019-09-16 10:23
 **/


public class JavaVMStackSOF {
    private static int stackLength=1;
    public static void stackLeak(){
        stackLength++;
        stackLeak();

    }
    public static void main(String[] args) {
        try {
            stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+ JavaVMStackSOF.stackLength);
            throw e;
        }
    }
    //java堆溢出
}
