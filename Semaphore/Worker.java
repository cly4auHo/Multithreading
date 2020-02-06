package semaphore;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {

    String name;
    Semaphore semaphore;

    public Worker(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name + " start");

        try {
            semaphore.acquire(); //wait пока нет места
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(name + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " end");
        semaphore.release(); //notify or notifyAll он сам решит
    }
}
