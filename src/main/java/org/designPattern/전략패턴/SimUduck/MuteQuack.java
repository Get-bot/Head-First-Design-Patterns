package org.designPattern.전략패턴.SimUduck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
