package com.giantdwarf.adapter.case1;

public class BToAAdapter implements APlayer {

    private BPlayer media;

    public BToAAdapter(BPlayer media) {
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        //A의 메서드로 B의 메서드를 호출
        System.out.println("Using Adapter :");
        media.playFile(fileName);
    }

    @Override
    public void stop() {

    }
}
