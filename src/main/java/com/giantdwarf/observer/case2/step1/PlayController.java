package com.giantdwarf.observer.case2.step1;

import java.util.ArrayList;
import java.util.List;


public class PlayController implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private boolean play; //실행 여부

    public PlayController() {

    }

    // 데이터를 전달 받아 플래그 값을 변경하고, 새로운 데이터가 들어왔음을 알림
    public void setFlag(boolean play){
        this.play=play;
        notifyObservers();
    }

    //실행 여부 플래그 값 반환
    public boolean getFlag(){
        return play;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(play);
        }
    }
}
