package keyword;

public class A {
// this关键字主要有三个应用：
//     (1)this调用本类中的属性，也就是类中的成员变量；
//     (2)this调用本类中的其他方法；
//     (3)this调用本类中的其他构造方法，调用时要放在构造方法的首行。

    public static int i=1;
    public A(int i){
        int k=this.i;//为10
        int j=i;
        System.out.println(k);
        System.out.println(j);
        this.i=i;
//        i=this.i;//对象值为1
    }
    public A(){

    }

}
