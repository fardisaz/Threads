package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello from the main thread");
        Thread anotherThread=new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();


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
                try {
                    //when we join a thread to another thread what happens is that the first thread will wait for the second thread to terminate
                    //and then it will continue to execute
                    anotherThread.join();
                    System.out.println(ThreadColor.ANSI_RED+"Another thread terminated,or timed out so I am running again");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ANSI_RED+"I could not wait after all.I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        //anotherThread.interrupt(); in this case it won't wait for 3 seconds,it prints out whatever written in catch

        System.out.println(ThreadColor.ANSI_PURPLE+"Hello again from the main thread");
    }
}
