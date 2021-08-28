package chap1.step3;

/**
 * @author oldcwj
 *
 * 红头鸭实现类
 */

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    void display() {
        System.out.println("我是红头鸭");
    }

    @Override
    public void fly() {
        System.out.println("我会飞了");
    }

    @Override
    public void quack() {
        System.out.println("我会叫了");
    }
}
