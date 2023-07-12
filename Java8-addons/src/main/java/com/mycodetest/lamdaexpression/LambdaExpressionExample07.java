package com.mycodetest.lamdaexpression;

public class LambdaExpressionExample07 {

    public static void main(String[] args) {
        Runnable basic = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running common task by : " + threadName);
        };

        Thread thread1 = new Thread(basic);
        Thread thread2 = new Thread(basic);

        thread1.start();
        thread2.start();
    }




}
