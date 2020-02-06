package semaphoreresource;

import java.util.concurrent.Semaphore;

public class Customer implements Runnable {

    private Semaphore semaphore;
    private Sklad sklad;

    public Customer(Sklad sklad, Semaphore semaphore) {
        this.sklad = sklad;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            sklad.getQ();
        }
    }
}
