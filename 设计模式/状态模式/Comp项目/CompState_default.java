package 设计模式.状态模式.Comp项目;

public class CompState_default extends CompState {

    @Override
    public void process() {
        System.out.println("默认处理！");
        this.projParam.setName("adfsf");
    }



}
