package chap1.step4.duck;

import chap1.step4.behavior.fly.FlyWithWings;
import chap1.step4.behavior.quack.MuteQuack;

/**
 * @author oldcwj
 *
 * 红头鸭实现类
 */

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("我是红头鸭");
    }
}
