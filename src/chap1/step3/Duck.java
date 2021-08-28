package chap1.step3;

/**
 * @author oldcwj
 *
 * 鸭子抽象类
 */

public abstract class Duck {

    protected void swim() {
        System.out.println("游泳中。。。");
    }

    abstract void display();
}
