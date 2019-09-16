package JVM;

/**
 * @author: Bravery
 * @create: 2019-09-16 10:37
 **/


public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }
    public void stackLeakByTherad(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByTherad();
    }

}
