package 设计模式.状态模式.Comp项目;

import 设计模式.状态模式.Context;
import 设计模式.状态模式.State;
import 设计模式.状态模式.param.CompParam;

public abstract class CompState extends State {
    protected CompContext compContext;
    protected CompParam projParam;

    @Override
    public void setContext(Context context) {
        this.compContext = (CompContext) context;
        this.projParam = compContext.getProjParam();
    }


}
