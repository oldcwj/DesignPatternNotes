package chap1.step4.behavior.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("什么都不叫..");
    }
}
