package chap1.step2;

/**
 * @author oldcwj
 *
 * 鸭子模拟器：测试类
 */

public class ZMiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        mallardDuck.fly();

        OtherDuck otherDuck = new OtherDuck();
        otherDuck.display();
        otherDuck.fly();
    }
}
