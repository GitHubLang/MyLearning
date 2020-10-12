package 多线程;

public class Room {
    int value = 0;

    public synchronized void  increment(){
            value++;
    }

    public synchronized void decrement(){
        value--;
    }

    public int getValue(){
        return value;
    }
}
