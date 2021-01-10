package 设计模式.状态模式.Proj项目;

public class ProjState_100 extends ProjState {


    @Override
    public void process() {

       if("100".equals(projParam.getCurrState())){
           System.out.println("100处理！");
           String mapper = projContext.projMapper.getMapper();
           System.out.println(mapper);
           projParam.setNextState("400");
           projParam.setCurrState("300");
       }else {
           System.out.println("后面处理！");
           projContext.setState(new ProjState_200());
           projContext.getResultParam();
       }

    }



}
