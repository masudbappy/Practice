package com.masudbappy.threadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NTHREAD = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREAD);
        for (int i=0; i<500; i++){
            Runnable worker = new MyRunnable(10000000L);
            executor.execute(worker);
        }
        executor.shutdown();
        System.out.println("Finished all threads");
    }
}
