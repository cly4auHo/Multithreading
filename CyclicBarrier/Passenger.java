package cyclicbarriermain;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Passenger implements Runnable {

    private String name;
    private CyclicBarrier cb;

    public Passenger(String name, CyclicBarrier cb) {
        this.name = name;
        this.cb = cb;
        new Thread(this).start();
    }

    public void run() {
        int timeToSleep = new Random().nextInt(6) + 3; // 3-8
        System.out.println(name + " going to bus");

        try {
            Thread.sleep(timeToSleep * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "in Bus");

        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
