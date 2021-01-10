package 设计模式.状态模式.Comp项目;

import 设计模式.状态模式.Context;
import 设计模式.状态模式.State;
import 设计模式.状态模式.param.CompParam;


public class CompContext extends Context<CompParam> {

    private CompParam projParam;

    public CompContext(CompParam projParam) {
        super(new CompState_100());
        this.projParam = projParam;
    }

    public CompParam getProjParam() {
        return projParam;
    }

    @Override
    public CompParam getResultParam(){
        State state = this.getState();
        state.setContext(this);
        state.process();
        return this.projParam;
    }
}
