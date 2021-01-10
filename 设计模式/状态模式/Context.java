package 设计模式.状态模式;

public abstract class Context<T> {
    protected State state;
    public Context(State state){
        this.state = state;
    }

    protected abstract T getResultParam();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
