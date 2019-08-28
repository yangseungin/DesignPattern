package com.giantdwarf.flyweight.case1.step2;

public class Testpattern {
    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.xPos=10;
        md1.yPos=11;
        md1.name="양승인";

        MyData md2 = new MyData();
        md2 = md1;

        MyData md3 = new MyData();
        md3.xPos=20;
        md3.yPos=21;
        md3.name="홍길동";

        md2.name="전우치";
        md2.xPos=5;

    }
}

class MyData{
    int xPos;
    int yPos;
    String name;

}