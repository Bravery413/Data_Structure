package newCoder;

/**
 * @author: Bravery
 * @create: 2019-09-18 15:17
 **/


public class B extends A {
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类初始化块");
    }
    public B(){
        System.out.println("子类构造方法");
    }
    public static void main(String[] args){
        new B();
    }
}
