package 多线程.创建;

public class ThreadTest extends Thread {

    @Override
    public void run(){
        System.out.println("继承Thread类，线程："+Thread.currentThread().getName());
    }

}
