package com.company;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+"Hello from "+currentThread().getName()+" thread");
    }
}