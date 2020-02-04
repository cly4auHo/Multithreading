package RunVasya;

public class Consumer implements Runnable {
    private Sklad sklad;

    public Consumer(Sklad sklad) {
        this.sklad = sklad;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            sklad.getQ();
        }
    }
}
