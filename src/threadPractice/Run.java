package threadPractice;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("begin->"+thread.isAlive());
        thread.start();
        System.out.println("end->"+thread.isAlive());

    }
}
