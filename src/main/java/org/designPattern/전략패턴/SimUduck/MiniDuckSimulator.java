package org.designPattern.전략패턴.SimUduck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(); // MallardDuck 객체 생성
        mallard.performQuack(); // MallardDuck이 QuackBehavior를 상속받아 quack()을 구현하므로, quack()이 실행된다.
        mallard.performFly(); // MallardDuck이 FlyBehavior를 상속받아 fly()을 구현하므로, fly()가 실행된다.

        Duck model = new ModelDuck(); // ModelDuck 객체 생성
        model.performFly(); // ModelDuck이 FlyBehavior를 상속받아 fly()을 구현하므로, fly()가 실행된다.
        model.setFlyBehavior(new FlyRocketPowered()); // ModelDuck이 FlyBehavior를 상속받아 fly()을 구현하므로, fly()가 실행된다.
        model.performFly(); // ModelDuck이 FlyBehavior를 상속받아 fly()을 구현하므로, fly()가 실행된다.

    }
}
