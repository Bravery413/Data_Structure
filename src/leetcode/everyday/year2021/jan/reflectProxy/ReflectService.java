package leetcode.everyday.year2021.jan.reflectProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: Bravery
 * @create: 2021-01-02 22:34
 **/


public class ReflectService {
    public void sayHello(String name){
        System.out.println("hello:"+name);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> reflectClass = Class.forName(ReflectService.class.getName());
        Object reflectService = reflectClass.newInstance();
        Method reflectMethod = reflectService.getClass().getMethod("sayHello", String.class);
        reflectMethod.invoke(reflectService,"bravery");
    }
}
