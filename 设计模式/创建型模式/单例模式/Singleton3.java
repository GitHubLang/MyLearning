package 设计模式.创建型模式.单例模式;

public class Singleton3 {
    private volatile static Singleton3 instance =null;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized (Singleton3.class){
                if(instance==null){
                    instance = new Singleton3();
                }
                return instance;
            }
        }
        return instance;
    }

}
