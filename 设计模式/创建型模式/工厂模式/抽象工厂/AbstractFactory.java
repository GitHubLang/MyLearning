package 设计模式.创建型模式.工厂模式.抽象工厂;

public abstract class AbstractFactory {

    public abstract Product newTV();
    public abstract Product newPhone();
    public abstract Product newNotebook();

}
