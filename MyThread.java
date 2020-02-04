package RunVasya;

public class MyThread implements Runnable {

    private volatile boolean bool = false;
    private int counter;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                if (bool) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println(counter);
            counter++;
        }
    }

    public synchronized void startThread() {
        bool = false;
        notify();
    }

    public synchronized void stopThread() {
        bool = true;
    }

    public MyThread() {
        new Thread(this).start();
    }
}
