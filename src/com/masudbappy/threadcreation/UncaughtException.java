package com.masudbappy.threadcreation;

public class UncaughtException {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Intentional Exception");
            }
        });
        thread.setName("worker thread 3");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error happend in thread " +
                        thread.getPriority()+ " the error is " + e.getMessage());
            }
        });
        thread.start();
    }
}
