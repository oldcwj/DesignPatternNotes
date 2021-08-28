package chap1.step3;

/**
 * @author oldcwj
 *
 * 其他的鸭子实现类，可能不会飞、不会叫，只是一个玩具鸭子
 */
public class OtherDuck extends Duck {

    @Override
    void display() {
        System.out.println("我是一个伪装的鸭子，伪装是一门技术");
    }

}
