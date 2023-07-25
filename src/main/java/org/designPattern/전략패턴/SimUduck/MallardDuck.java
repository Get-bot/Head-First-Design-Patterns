package org.designPattern.전략패턴.SimUduck;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack(); // MallardDuck이 QuackBehavior를 상속받아 quack()을 구현하므로, quack()이 실행된다.
        flyBehavior = new FlyWithWings(); // MallardDuck이 FlyBehavior를 상속받아 fly()을 구현하므로, fly()가 실행된다.
    }

    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
