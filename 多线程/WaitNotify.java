package 多线程;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Thread t1 = new Thread(()->{
            synchronized (obj){

                try {
                    System.out.println("t1等待");
                    obj.wait();
                    System.out.println("t1结束等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (obj){

                try {
                    System.out.println("t2等待");
                    obj.wait();
                    System.out.println("t2结束等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(2);
        synchronized (obj){
            obj.notify();
            //obj.notifyAll();
        }


    }
}
