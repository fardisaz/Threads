package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello from the main thread");
        Thread anotherThread=new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();
        //anotherThread.start(); we can not start an instance of a thread more than once

        new Thread(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN+"Hello from the anonymous class");
            }
        }.start();

        Thread myRunnableThread=new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED+"Hello from the anonymous class's implementation of run()");
            }
        });
        myRunnableThread.start();
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello again from the main thread");
    }
}
