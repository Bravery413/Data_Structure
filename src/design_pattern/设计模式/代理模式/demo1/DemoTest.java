package design_pattern.设计模式.代理模式.demo1;

/**
 * @author 潘勇
 * @date 2020/6/15 13:45
 */


public class DemoTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLover();
    }
}
