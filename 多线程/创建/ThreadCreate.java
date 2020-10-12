package 多线程.创建;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCreate {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new ThreadTest();
        Thread t2 = new Thread(new ThreadRunnable());
        FutureTask<Integer> futureTask = new FutureTask<>(new ThreadCallable());
        Thread t3 = new Thread(futureTask);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("FutureTask返回值："+futureTask.get());

    }
}
