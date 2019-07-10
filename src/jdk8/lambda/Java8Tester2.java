package jdk8.lambda;

import java.util.Comparator;

public class Java8Tester2 {
    final static String salutation = "Hello! ";

    public static void main(String args[]) {
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");


        //在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
//        String first = "";
//        Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());
//      Error:(14, 42) java: 已在方法 main(java.lang.String[])中定义了变量 first
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
