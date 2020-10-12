package 多线程.创建;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCreateNew {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread t1 = new Thread("t1"){
            public void run(){
                System.out.println("1.--------------------");
                System.out.println("重写Thread,run方法！--"+Thread.currentThread().getName());
            }
        };
        t1.start();


        Thread t2 = new Thread(()->{
            System.out.println("2.--------------------");
            System.out.println("函数式编程Runnable接口，"+Thread.currentThread().getName());
        },"t2");
        t2.start();

        FutureTask<Integer> futureTask = new FutureTask<>(()->{
            System.out.println("3.------------------");
            System.out.println("futuretask,callable接口"+Thread.currentThread().getName());
            return 1;
        });
        Thread t3 = new Thread(futureTask,"t3");
        t3.start();
        System.out.println(futureTask.get());


    }
}
