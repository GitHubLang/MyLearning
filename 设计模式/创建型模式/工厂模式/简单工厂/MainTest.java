package 设计模式.创建型模式.工厂模式.简单工厂;

public class MainTest {

    public static void main(String[] args) {

        Fruit apple = FruitFactory.getApple();
        Fruit banana = FruitFactory.getBanana();

        apple.eat();
        banana.eat();
    }

}
