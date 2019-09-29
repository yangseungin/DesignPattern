package com.giantdwarf.adapter.case2;

import com.giantdwarf.adapter.case2.APlayer;
import com.giantdwarf.adapter.case2.BPlayer;

//extends와 implements를 동시에 사용해서 다중상속 흉내
public class BToAAdapter extends BPlayerImpl implements APlayer {

    @Override
    public void play(String fileName) {
        //A의 메서드로 B의 메서드를 호출
        System.out.println("Using Adapter :");
        playFile(fileName);
    }

    @Override
    public void stop() {

    }
}
