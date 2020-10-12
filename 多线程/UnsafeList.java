package 多线程;

import java.util.ArrayList;
import java.util.List;

public class UnsafeList {
    List<String> list  = new ArrayList<>();

    public void method1(){
        for (int i = 0; i <1000 ; i++) {
            method2();
            method3();
        }
    }

    private void method3() {
        list.remove(0);
    }

    private void method2() {
        list.add("0");
    }

    public static void main(String[] args) {
        UnsafeList unsafeList = new UnsafeList();

        for (int i = 0; i <2 ; i++) {
            new Thread(unsafeList::method1,"t"+i).start();
        }

    }

}
