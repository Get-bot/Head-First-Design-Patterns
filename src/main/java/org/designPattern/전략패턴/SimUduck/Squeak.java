package org.designPattern.전략패턴.SimUduck;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("삑");
    }
}
