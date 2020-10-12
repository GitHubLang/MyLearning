package 多线程.创建;

import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        System.out.println("实现Callable接口,返回1，线程："+Thread.currentThread().getName());

        return 1;
    }
}
