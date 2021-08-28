package chap1.step1;

/**
 * @author oldcwj
 *
 * 鸭子抽象类
 */

public abstract class Duck {
    protected void quack() {
        System.out.println("呱呱叫。。。");
    }

    protected void swim() {
        System.out.println("游泳中。。。");
    }

    abstract void display();

    protected void fly() {
        System.out.println("我飞起来了。。。");
    }
}
