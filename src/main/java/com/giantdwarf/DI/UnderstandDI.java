package com.giantdwarf.DI;

import java.util.Date;

public class UnderstandDI {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

    }

    public static void getDate(Date d){
        Date date = d;
        System.out.println(date);
    }

    public static void memberUse1(){
        //강한결합은 직접 생성
        Member m1 = new Member();
    }

    public static void memberUse2(Member m){
        //약한 결합은 생성된것을 주입받음.
        Member m2 = m;
    }
}

// Member를 사용한다 --> Member의 기능에 의존한다.
class Member{
    String name;
    String nickname;

    public Member() {

    }
}
