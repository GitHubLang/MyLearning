package 多线程;

public class SynRoomTest {

    public static void main(String[] args) throws InterruptedException {
        Room room = new Room();

        Thread t1 = new Thread(()->{
            for (int i = 0; i <5000 ; i++) {
                room.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i <5000 ; i++) {
                room.decrement();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(room.getValue());

    }

}
