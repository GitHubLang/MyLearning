package 设计模式.创建型模式.单例模式;

/**
 * 饿汉式
 * 效率低
 */
public class Singleton2 {

    private static volatile Singleton2 instance= null;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(instance==null){
            return new Singleton2();
        }
        return instance;
    }

}
