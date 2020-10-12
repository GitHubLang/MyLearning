package 多线程;

public class Synchronized {

        static int count =0;
        static final Object room = new Object();


        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(()->{
                for (int i = 0; i < 5000 ; i++) {
                    synchronized (room){
                        count++;
                    }
                }
            });

            Thread t2 = new Thread(()->{
                for (int i = 0; i <5000 ; i++) {
                    synchronized (room){
                        count--;
                    }
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(count);
        }

}
