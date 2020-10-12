package 设计模式.创建型模式.工厂模式.工厂方法;

public class Product1Factory extends AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("生产产品1");
        return new RealPruduct1();
    }
}
