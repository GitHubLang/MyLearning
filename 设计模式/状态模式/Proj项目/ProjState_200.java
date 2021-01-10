package 设计模式.状态模式.Proj项目;


public class ProjState_200 extends ProjState {

    @Override
    public void process() {

        if("200".equals(this.projParam.getCurrState())){
            System.out.println("200处理！");
        }else {
            System.out.println("后面处理！");
            projContext.setState(new ProjState_300());
            projContext.getResultParam();
        }
    }



}
