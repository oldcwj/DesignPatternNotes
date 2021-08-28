package chap1.step3;

/**
 * @author oldcwj
 *
 * 鸭子模拟器：测试类
 */

public class ZMiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        if (mallardDuck instanceof Flyable) {
            ((Flyable)mallardDuck).fly();
        }

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        if (redheadDuck instanceof Flyable) {
            ((Flyable)redheadDuck).fly();
        }

        Duck otherDuck = new OtherDuck();
        otherDuck.display();
    }
}
