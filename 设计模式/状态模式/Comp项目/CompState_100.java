package 设计模式.状态模式.Comp项目;

public class CompState_100 extends CompState {


    @Override
    public void process() {

       if("100".equals(this.projParam.getCurrState())){
           System.out.println("100处理！");
           projParam.setNextState("400");
           projParam.setCurrState("300");
       }else {
           System.out.println("后面处理！");
           compContext.setState(new CompState_200());
           compContext.getResultParam();
       }

    }



}
