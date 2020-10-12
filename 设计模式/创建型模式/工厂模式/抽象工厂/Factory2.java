package 设计模式.创建型模式.工厂模式.抽象工厂;

public class Factory2 extends AbstractFactory {
    @Override
    public Product newTV() {
        return new TV2();
    }

    @Override
    public Product newPhone() {
        return new Phone2();
    }

    @Override
    public Product newNotebook() {
        return new Notebook2();
    }
}
