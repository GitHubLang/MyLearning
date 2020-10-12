package 设计模式.创建型模式.工厂模式.工厂方法;

public class MainTest {

    public static void main(String[] args) {

        AbstractFactory product1Factory = new Product1Factory();
        AbstractFactory product2Factory = new Product2Factory();

        Product product1 = product1Factory.newProduct();
        Product product2 = product2Factory.newProduct();

        product1.show();
        product2.show();
    }

}
