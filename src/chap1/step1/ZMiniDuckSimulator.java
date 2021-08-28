package chap1.step1;

/**
 * @author oldcwj
 *
 * 鸭子模拟器：测试类
 */

public class ZMiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
    }
}
