package com.masudbappy.threadtermination;

public class Example1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        // this will wait long time
        thread.start();
        // to interrupt
        thread.interrupt();


    }
    private static class Task implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
