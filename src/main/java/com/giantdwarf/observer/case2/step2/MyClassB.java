package com.giantdwarf.observer.case2.step2;

public class MyClassB implements Observer {

    Publisher observable;   //등록될 Observable
    private boolean bPlay; //실행여부

    public MyClassB(Publisher observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void myActControl(){
        if(bPlay){
            System.out.println("MyClassB: 동작시작");
        }else{
            System.out.println("MyClassB: 동작정지");
        }
    }

    @Override
    public void update(Boolean play) {
    this.bPlay=play;
    myActControl();
    }
}
