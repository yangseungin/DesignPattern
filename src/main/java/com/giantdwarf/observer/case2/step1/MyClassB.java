package com.giantdwarf.observer.case2.step1;

public class MyClassB implements Observer {


    private boolean bPlay; //실행여부


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
