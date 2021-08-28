package chap1.step4.simulator;

import chap1.step4.duck.Duck;
import chap1.step4.duck.MallardDuck;
import chap1.step4.behavior.fly.FlyNoWay;

/**
 * @author oldcwj
 *
 * 鸭子模拟器：测试类
 */

public class ZMiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
