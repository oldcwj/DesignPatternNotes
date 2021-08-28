package chap1.step2;

/**
 * @author oldcwj
 *
 * 其他的鸭子实现类，可能不会飞、不会叫，只是一个玩具鸭子
 */
public class OtherDuck extends Duck{

    @Override
    protected void quack() {
        System.out.println("不会叫。。。");
    }

    @Override
    void display() {
        System.out.println("我是一个伪装的鸭子");
    }

    @Override
    protected void fly() {
        System.out.println("我不会飞");
    }
}
