package latch;

import java.util.concurrent.CountDownLatch;

public class WorkerLatch implements Runnable {

    private String name;
    private CountDownLatch cdl;

    public WorkerLatch(String name, CountDownLatch cdl) {
        this.name = name;
        this.cdl = cdl;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name + " start");

        for (int i = 0; i < 5; i++) {
            System.out.println(name + i);
            cdl.countDown();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " end");
    }
}
