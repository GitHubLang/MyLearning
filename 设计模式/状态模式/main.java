package 设计模式.状态模式;

import 设计模式.状态模式.Comp项目.CompContext;
import 设计模式.状态模式.Proj项目.ProjContext;
import 设计模式.状态模式.param.CompParam;
import 设计模式.状态模式.param.ProjParam;

public class main {
    public static void main(String[] args) {

        ProjParam projParam = new ProjParam();
        projParam.setCurrState("100");

        Context<ProjParam> context = new ProjContext(projParam);
        ProjParam resultParam = context.getResultParam();

        System.out.println(resultParam);

        CompParam compParam = new CompParam();
        compParam.setCurrState("400");

        Context<CompParam> context1 = new CompContext(compParam);
        CompParam resultParam1 = context1.getResultParam();
        System.out.println(resultParam1);
    }
}
