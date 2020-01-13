package newCoder;

/**
 * @author: Bravery
 * @create: 2019-09-18 15:16
 **/


public class A {
    static {
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类初始化块");
    }
    public A(){
        System.out.println("父类构造方法");
    }

}
