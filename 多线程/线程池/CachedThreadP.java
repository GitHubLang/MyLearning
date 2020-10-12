package 多线程.线程池;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CachedThreadP {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(()->{
            System.out.println("execute方法执行");
        });

        Future<Integer> future = pool.submit(() -> {
            System.out.println("submit方式执行，返回1");
            return 1;
        });
        System.out.println("future.get():"+future.get());

        List<Callable<Integer>> list= new ArrayList<>();

        for (int i =1 ; i <=10 ; i++) {
            int finalI = i;
            list.add(()->{
                System.out.println("任务："+ finalI);
                return finalI;
            });
        }

        List<Future<Integer>> futures = pool.invokeAll(list);
        futures.forEach((future1)->{
            try {
                System.out.println(future1.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        pool.shutdown();

    }

}
