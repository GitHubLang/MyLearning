package 设计模式.状态模式.Comp项目;

public class CompState_300 extends CompState {

    @Override
    public void process() {

        if("300".equals(this.projParam.getCurrState())){
            System.out.println("300处理！");
        }else {
            compContext.setState(new CompState_default());
            compContext.getResultParam();
        }
    }



}
