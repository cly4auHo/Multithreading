package RunVasya;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();

        Thread.sleep(2000);
        myThread.stopThread();
        Thread.sleep(2000);
        myThread.startThread();
    }
}
