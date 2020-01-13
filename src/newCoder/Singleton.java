package newCoder;

/**
 * @author: Bravery
 * @create: 2019-09-19 08:11
 **/


public class Singleton {
   private static Singleton singleton=new Singleton();
   private Singleton(){}
   public static Singleton getInstance(){
       return singleton;
   }
}

