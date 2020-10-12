package 设计模式.结构型模式.代理模式.静态代理;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户！");
    }

    @Override
    public void find() {
        System.out.println("查找用户！");
    }
}
