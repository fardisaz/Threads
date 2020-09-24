package com.company;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+"Hello from "+currentThread().getName()+" thread");
        //whenever you use sleep(), you should use try/catch
        try {
            //after 3 seconds go to line 14
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE+"Another Thread woke me up");
        }
        System.out.println(ThreadColor.ANSI_BLUE+"Three seconds have passed & I am awake");
    }
}
