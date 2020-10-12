package 多线程;

public class Join {
    static int i = 1;
    static int j = 2;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1);
                i = 5;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2);
                j = 10;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.start();

        t1.join();
        t2.join();
        System.out.println(i+" "+j);

    }

}
