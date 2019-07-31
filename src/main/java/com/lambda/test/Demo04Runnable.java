package com.lambda.test;

public class Demo04Runnable {
    private static void startThread(Runnable task){
        new Thread(task).start();
    }

    public static void main(String[] args) {
        startThread(() -> System.out.println("线程任务执行！"));
    }

}
