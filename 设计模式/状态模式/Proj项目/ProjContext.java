package 设计模式.状态模式.Proj项目;

import 设计模式.状态模式.Context;
import 设计模式.状态模式.State;
import 设计模式.状态模式.param.ProjParam;

public class ProjContext extends Context {

    private ProjParam projParam;

    public ProjContext(ProjParam projParam) {
        super(new ProjState_100());
        this.projParam = projParam;
    }

    public ProjParam getProjParam() {
        return projParam;
    }

    @Override
    public ProjParam getResultParam(){
        State state = this.getState();
        state.setContext(this);
        state.process();
        return this.projParam;
    }
}
