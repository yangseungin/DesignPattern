package com.giantdwarf.builder.step1;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = createPersonForTesting();
        System.out.println(p1.getFirstName());

    }

    public static Person createPersonForTesting(){
        Person person = new Person();
        person.setFirstName("FirstName");
        person.setLastName("LastName");
        person.setAddressOne("Address1");
        person.setAddressTwo("address2");
        person.setSex("Man");
        person.setDriverLicense(false);
        person.setMarried(true);
        //멤버 변수가 많으면 변수값 세팅이 어려워짐
        return person;
    }

}
