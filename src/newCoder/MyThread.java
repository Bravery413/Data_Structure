package newCoder;

/**
 * @author: Bravery
 * @create: 2019-09-19 08:30
 **/


public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(111);
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
