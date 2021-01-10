package 设计模式.状态模式.param;

public class CompParam {

    String id;
    String name;
    String currState;
    String nextState;
    String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrState() {
        return currState;
    }

    public void setCurrState(String currState) {
        this.currState = currState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNextState() {
        return nextState;
    }

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }

    @Override
    public String toString() {
        return "ProjParam{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", currState='" + currState + '\'' +
                ", nextState='" + nextState + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
