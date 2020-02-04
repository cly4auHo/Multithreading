package RunVasya;

public class Fedor implements Runnable {

    public Fedor(Shared shared) {
        this.shared = shared;
        new Thread(this).start();
    }

    Shared shared;

    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (shared.getX() % 2 == 0) {
                System.out.println(shared.getX());
            }
        }
    }
}
