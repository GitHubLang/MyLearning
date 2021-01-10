package 设计模式.状态模式;

import 设计模式.状态模式.Proj项目.ProjContext;
import 设计模式.状态模式.param.ProjParam;

public class main {
    public static void main(String[] args) {

        ProjParam projParam = new ProjParam();
        projParam.setCurrState("100");

        Context context = new ProjContext(projParam);
        ProjParam resultParam = (ProjParam)context.getResultParam();

        System.out.println(resultParam);
    }
}
