package RunVasya;

public class Boozer implements Runnable {

    Shared shared;

    public Boozer(Shared shared) {
        this.shared = shared;
        new Thread(this).start();
    }

    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            shared.setX(shared.getX() + 1);
        }
    }
}
