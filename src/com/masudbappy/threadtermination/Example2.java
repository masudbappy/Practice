package com.masudbappy.threadtermination;

import java.math.BigInteger;

public class Example2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputaionTask(new BigInteger("200000"), new BigInteger("922285455")));
        // there is other way to stop app to make setDaemon(true). In that case you no need to check isInterrupted()
//        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

    private static class LongComputaionTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongComputaionTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow(base, power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("Prematurely isInterrupted computation");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }
            return result;
        }
    }
}
