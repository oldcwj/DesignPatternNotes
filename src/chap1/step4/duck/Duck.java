package chap1.step4.duck;

import chap1.step4.behavior.fly.FlyBehavior;
import chap1.step4.behavior.quack.QuackBehavior;

/**
 * @author oldcwj
 *
 * 鸭子抽象类
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected void swim() {
        System.out.println("游泳中。。。");
    }

    abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
