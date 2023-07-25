package org.designPattern.전략패턴.SimUduck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("꽥꽥!!");
    }
}
