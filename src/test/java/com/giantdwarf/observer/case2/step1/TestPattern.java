package com.giantdwarf.observer.case2.step1;

public class TestPattern {
    public static void main(String[] args) {
        PlayController pager = new PlayController();

        Observer ob1 = new MyClassA();
        Observer ob2 = new MyClassB();

        // 옵저버 등록
        pager.addObserver(ob1);
        pager.addObserver(ob2);

        //메세지 등록
        pager.setFlag(false);

        // 구독 해지
        pager.deleteObserver(ob2);

        System.out.println("-----------------");

        //메세지 등록
        pager.setFlag(true);
    }

}
