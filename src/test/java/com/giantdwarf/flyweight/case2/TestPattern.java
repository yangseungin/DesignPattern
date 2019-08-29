package com.giantdwarf.flyweight.case2;

import com.giantdwarf.flyweight.case1.step2.FlyweightFactory;

public class TestPattern {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getSubject("a");
        flyweightFactory.getSubject("a");
        flyweightFactory.getSubject("b");
        flyweightFactory.getSubject("b");

    }
}
