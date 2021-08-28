package chap1.step4.behavior.fly;

import chap1.step4.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞起来");
    }
}
