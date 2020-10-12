package 设计模式.结构型模式.代理模式.静态代理;

public class ProxyUserDao implements UserDao {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void save() {
        System.out.println("代理前置操作！");
        userDao.save();
        System.out.println("代理后置操作！");
    }

    @Override
    public void find() {
        System.out.println("代理前置操作！");
        userDao.find();
        System.out.println("代理后置操作！");
    }

    public static void main(String[] args) {
        UserDao userDao = new ProxyUserDao();
        userDao.save();
    }

}
