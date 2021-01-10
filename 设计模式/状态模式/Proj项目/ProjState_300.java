package 设计模式.状态模式.Proj项目;

public class ProjState_300 extends ProjState {

    @Override
    public void process() {

        if("300".equals(this.projParam.getCurrState())){
            System.out.println("300处理！");
        }else {
            projContext.setState(new ProjState_default());
            projContext.getResultParam();
        }
    }



}
