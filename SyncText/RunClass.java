package RunVasya;

public class RunClass implements Runnable {

    Classic classic;
    String text;

    @Override
    public void run() {
        synchronized (classic) {
            classic.printText(text);
        }
    }

    public RunClass(Classic classic, String text) {
        this.classic = classic;
        this.text = text;
        new Thread(this).start();
    }
}
