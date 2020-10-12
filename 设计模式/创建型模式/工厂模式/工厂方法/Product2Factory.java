package 设计模式.创建型模式.工厂模式.工厂方法;

public class Product2Factory extends AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("生产产品2");
        return new RealProduct2();
    }
}
