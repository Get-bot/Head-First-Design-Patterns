package org.designPattern.전략패턴.SimUduck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    // 다음 두 메소드는 Duck 클래스에 추가된 새로운 메소드
    public void performFly() {
        flyBehavior.fly(); // 행동 클래스에 위임
    }

    public void performQuack() {
        quackBehavior.quack(); // 행동 클래스에 위임
    }

    // 두 메소드는 Duck 클래스에 추가된 새로운 메소드
    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    // 다음 두 메소드는 Duck 클래스에 추가된 새로운 메소드
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}