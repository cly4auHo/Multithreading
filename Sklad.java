package RunVasya;

public class Sklad {
    private int q;
    volatile boolean bool;

    public synchronized int getQ() {
        if (!bool) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        bool = !bool;
        notify();

        System.out.println("Get " + q);
        int temp = q;
        q = 0;
        return temp;
    }

    public synchronized void putQ(int q) {
        if (bool) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        bool = !bool;
        System.out.println("Put " + q);
        notify();
        this.q = q;
    }
}
