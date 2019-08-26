package com.giantdwarf.singleton.case1.step3;

import com.giantdwarf.singleton.case1.step3.Database;

public class TestPattern2 {

    static int nNum = 0;

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance(nNum+"번째 Database");
                System.out.println("THis is the "+database.getName()+"!");
            }catch (Exception e){

            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }



    }
}
