package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Worker("A", semaphore);
        new Worker("B", semaphore);
        new Worker("C", semaphore);
    }
}
