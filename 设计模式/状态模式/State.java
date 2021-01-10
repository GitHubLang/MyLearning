package 设计模式.状态模式;

public abstract class State {
    protected Context context;


    public abstract void process();

    public abstract void setContext(Context context);


}
