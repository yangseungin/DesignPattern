package com.giantdwarf.adapter.case1;

public class APlayerImpl implements APlayer {

    @Override
    public void play(String fileName) {
        System.out.println("(A) "+fileName);
    }

    @Override
    public void stop() {
    }
}
