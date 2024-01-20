package com.masudbappy.threadcreation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in thread: " + Thread.currentThread().getName());
            System.out.println("Current thread priority is: " + Thread.currentThread().getPriority());
        });
        // This will execute first. As the main thread is created first.
        System.out.println("We are in thread: " + Thread.currentThread().getName() +
                " before starting a new Thread");
        // to give a thread name
        thread.setName("worker thread ");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        // This will execute first. As the main thread is created first.
        System.out.println("We are in Thread: " + Thread.currentThread().getName() +
                " after starting a new thread");
//         Thread.sleep(10000);
    }
}
