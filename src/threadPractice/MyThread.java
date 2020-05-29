package threadPractice;

public class MyThread extends Thread {
    private int count=5;

    @Override
    public synchronized void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println(Thread.currentThread().getName()+"计算结果="+count);
        }
    }
}
