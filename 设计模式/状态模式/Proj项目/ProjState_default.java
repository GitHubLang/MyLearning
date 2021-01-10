package 设计模式.状态模式.Proj项目;

import 设计模式.状态模式.param.ProjParam;

public class ProjState_default extends ProjState {

    @Override
    public void process() {
        System.out.println("默认处理！");
        this.projParam.setName("adfsf");
    }



}
