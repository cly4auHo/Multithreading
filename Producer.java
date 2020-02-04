package RunVasya;

public class Producer implements Runnable {
    private Sklad sklad;

    @Override
    public void run() {
        int qnt = 1;

        while (true) {
            sklad.putQ(qnt++);
        }
    }

    public Producer(Sklad sklad) {
        this.sklad = sklad;
        new Thread(this).start();
    }
}
