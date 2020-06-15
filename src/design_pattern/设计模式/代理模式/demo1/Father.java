package design_pattern.设计模式.代理模式.demo1;

/**
 * @author 潘勇
 * @date 2020/6/15 13:42
 */

/**
 * 父亲是儿子相亲的代理,
 * before()和after增强了findLover()方法
 */
public class Father extends Person {
    public Son son;

    //构造一个父亲需要传入一个儿子
    public Father(Son son) {
        this.son = son;
    }

    public void findLover() {
        before();
        son.findLover();
        after();
    }

    public void before() {
        System.out.println("给儿子物色人选");
    }

    public void after() {
        System.out.println("询问女方是否合适");
    }


}
