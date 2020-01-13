package newCoder;

/**
 * @author: Bravery
 * @create: 2019-09-19 08:35
 **/


public class RunTask implements Runnable {

    @Override
    public void run() {
        System.out.println(222);
    }

    public static void main(String[] args) {
        RunTask runTask = new RunTask();
        new Thread(runTask).start();
    }
}
