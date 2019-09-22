package com.giantdwarf.observer.case2.step1;

public class MyClassA implements Observer {


    private boolean bPlay; //실행여부



    public void myActControl() {
        if (bPlay) {
            System.out.println("MyClassA: 동작시작");
        } else {
            System.out.println("MyClassA: 동작정지");
        }
    }

    @Override
    public void update(Boolean play) {
        this.bPlay=play;
        myActControl();
    }
}
