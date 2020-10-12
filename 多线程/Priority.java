package 多线程;

public class Priority {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        },"t1");
         Thread t2 = new Thread(()->{
            for (int i = 0; ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        },"t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
