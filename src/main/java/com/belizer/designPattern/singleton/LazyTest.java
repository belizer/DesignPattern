package com.belizer.designPattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 47131 on 2018/3/8.
 */
public class LazyTest {
    public static void main(String[] args) {
        int n=200;
        final CountDownLatch countDownLatch=new CountDownLatch(n);
        for(int i=0;i<n;i++){
            new Thread() {
                @Override
                public void run(){
                    System.out.println(Lazy.getInstance());
                    countDownLatch.countDown();
                }
            }.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
