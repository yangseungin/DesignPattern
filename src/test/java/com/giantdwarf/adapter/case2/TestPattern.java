package com.giantdwarf.adapter.case2;

public class TestPattern {
    public static void main(String[] args) {
        APlayer player1 = new APlayerImpl();
        player1.play("aaa.mp3");

        //계약 기간 만료로 APlayerImpl()사용할수없음.

        BPlayer player2 = new BPlayerImpl();
        player2.playFile("bbb.mp3");

        //BtoA어댑터 적용
        APlayer player3 = new BToAAdapter();
        player3.play("ccc.mp3");
    }
}
