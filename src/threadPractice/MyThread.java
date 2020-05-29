package threadPractice;

public class MyThread extends Thread {
    private int count=5;

    @Override
    public synchronized void run() {
        System.out.println("run->"+this.isAlive());
    }
}
