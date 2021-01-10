package 设计模式.状态模式.Comp项目;


public class CompState_200 extends CompState {

    @Override
    public void process() {

        if("200".equals(this.projParam.getCurrState())){
            System.out.println("200处理！");
        }else {
            System.out.println("后面处理！");
            compContext.setState(new CompState_300());
            compContext.getResultParam();
        }
    }



}
