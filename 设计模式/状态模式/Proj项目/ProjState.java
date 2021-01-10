package 设计模式.状态模式.Proj项目;

import 设计模式.状态模式.Context;
import 设计模式.状态模式.State;
import 设计模式.状态模式.param.ProjParam;

public abstract class ProjState extends State {
    protected ProjContext projContext;
    protected ProjParam projParam;

    @Override
    public void setContext(Context context) {
        this.projContext = (ProjContext) context;
        this.projParam = projContext.getProjParam();
    }


}
