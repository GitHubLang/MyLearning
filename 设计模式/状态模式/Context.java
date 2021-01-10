package 设计模式.状态模式;

public abstract class Context {
    private State state;
    public Context(State state){
        this.state = state;
    }

    protected abstract <T>T getResultParam();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
