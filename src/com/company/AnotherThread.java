package com.company;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+"Hello from "+currentThread().getName()+" thread");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE+"Another Thread woke me up");
            return;
        }
        System.out.println(ThreadColor.ANSI_BLUE+"Three seconds have passed & I am awake");
    }
}
