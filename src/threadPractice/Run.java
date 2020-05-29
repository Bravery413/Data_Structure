package threadPractice;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread A = new Thread(thread, "A");
        Thread B = new Thread(thread, "B");
        Thread C = new Thread(thread, "C");
        A.start();
        B.start();
        C.start();

    }
}
