package semaphoreresource;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Semaphore semaphore;
    private Sklad sklad;

    public void run() {
        int qnt = 1;

        while (true) {
            sklad.putQ(qnt++);
        }
    }

    public Producer(Sklad sklad, Semaphore semaphore) {
        this.sklad = sklad;
        this.semaphore = semaphore;
        new Thread(this).start();
    }
}
