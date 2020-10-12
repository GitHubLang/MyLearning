package 设计模式.创建型模式.单例模式;

/***
 * 单例模式
 * 饿汉式单例
 */
public final class Singleton1 {
   private static final Singleton1 instance = new Singleton1();
   private Singleton1(){}

    public static Singleton1 getInstance() {
        return instance;
    }

}

