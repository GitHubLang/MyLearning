package 设计模式.创建型模式.工厂模式.简单工厂;

public class FruitFactory {

    public static Fruit getApple(){
        return new Apple();
    }

    public static Fruit getBanana(){
        return new Banan();
    }

}
