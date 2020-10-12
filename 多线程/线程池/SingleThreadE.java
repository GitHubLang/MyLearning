package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadE {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();

        pool.execute(()->{
            System.out.println("单线程线程池");
        });
        pool.shutdown();

    }

}
