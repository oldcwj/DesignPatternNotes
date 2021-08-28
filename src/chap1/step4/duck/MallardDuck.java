package chap1.step4.duck;

import chap1.step4.behavior.fly.FlyWithWings;
import chap1.step4.behavior.quack.Quack;

/**
 * @author oldcwj
 *
 * 绿头鸭实现类
 */

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("我是绿头鸭。");
    }
}
