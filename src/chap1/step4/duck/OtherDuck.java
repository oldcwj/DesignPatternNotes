package chap1.step4.duck;

import chap1.step4.behavior.fly.FlyNoWay;
import chap1.step4.behavior.quack.MuteQuack;

/**
 * @author oldcwj
 *
 * 其他的鸭子实现类，可能不会飞、不会叫，只是一个玩具鸭子
 */
public class OtherDuck extends Duck {
    public OtherDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("我是一个伪装的鸭子");
    }

}
