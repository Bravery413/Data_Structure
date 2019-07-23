package design_pattern.singleton_pattern;

public class SingleObject {
    //饿汉式,线程不安全
    private static SingleObject instance = new SingleObject();

    //构造函数私有化
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello world");
    }
}
