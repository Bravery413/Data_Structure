//package jdk8.methodReference;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 方法引用通过方法的名字来指向一个方法。
// *
// * 方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
// *
// * 方法引用使用一对冒号 :: 。
// *
// * 下面，我们在 Car 类中定义了 4 个方法作为例子来区分 Java 中 4 种不同方法的引用。
// */
//public class Java8Tester9 {
//    public static void main(String args[]){
//        List names = new ArrayList();
//
//        names.add("Google");
//        names.add("Runoob");
//        names.add("Taobao");
//        names.add("Baidu");
//        names.add("Sina");
//
//        names.forEach(System.out::println);
//    }
//}
