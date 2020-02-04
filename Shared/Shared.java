package RunVasya;

public class Shared {
    private int x = 0;

    public synchronized int getX() {
        return x;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }
}
