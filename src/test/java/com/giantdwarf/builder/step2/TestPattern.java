package com.giantdwarf.builder.step2;


import java.time.LocalDate;
import java.time.Month;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("수원시 ")
                .addressTwo("장안구")
                .birthDate(LocalDate.of(1992, Month.JUNE,6))
                .sex("male")
                .driverLicence(true)
                .married(false)
                .build();

        System.out.println(p1.getAddressOne());


    }



}
