package 多线程;

import java.util.ArrayList;
import java.util.List;

public class SafeList {


    public void method1(){
        List<String> list  = new ArrayList<>();
        for (int i = 0; i <1000 ; i++) {
            method2(list);
            method3(list);
        }
    }

    private void method3(List<String> list) {
        list.remove(0);
    }

    private void method2(List<String> list) {
        list.add("0");
    }

    public static void main(String[] args) {
        SafeList safeList = new SafeList();

        for (int i = 0; i <2 ; i++) {
            new Thread(safeList::method1,"t"+i).start();
        }

    }

}
