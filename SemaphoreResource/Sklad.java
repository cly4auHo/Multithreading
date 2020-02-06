package semaphoreresource;

import java.util.concurrent.Semaphore;

public class Sklad {
    private int q;
    private Semaphore semaphoreProducer;
    private Semaphore semaphoreCustomer;

    public Sklad(Semaphore semaphoreProducer, Semaphore semaphoreCustomer) {
        this.semaphoreProducer = semaphoreProducer;
        this.semaphoreCustomer = semaphoreCustomer;
    }

    public int getQ() {
        try {
            semaphoreCustomer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Get " + q);
        semaphoreProducer.release();
        int temp = q;
        q = 0;
        return temp;
    }

    public void putQ(int q) {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphoreCustomer.release();
        System.out.println("Put " + q);
        this.q = q;
    }
}
