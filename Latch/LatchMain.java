package latch;

import java.util.concurrent.CountDownLatch;

public class LatchMain {
    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(5);
        new WorkerLatch("A",cdl);
        cdl.countDown();

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End");
    }
}
