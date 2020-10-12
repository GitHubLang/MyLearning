package 多线程;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class ParkUnpark {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            System.out.println("start....");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("park...");
            LockSupport.park();
            System.out.println("resume....");
        });
        t1.start();
        Thread.sleep(3);
        System.out.println("unpark....");
        LockSupport.unpark(t1);



    }
}
