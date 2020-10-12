package 设计模式.创建型模式.工厂模式.抽象工厂;

public class Factory1 extends AbstractFactory {
    @Override
    public Product newTV() {
        return new TV1();
    }

    @Override
    public Product newPhone() {
        return new Phone1();
    }

    @Override
    public Product newNotebook() {
        return new Notebook1();
    }
}
