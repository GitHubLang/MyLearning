package 多线程.创建;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口，线程"+Thread.currentThread().getName());
    }
}
