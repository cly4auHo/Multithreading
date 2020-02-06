package exchangerthread;

import java.util.concurrent.Exchanger;

public class StringConsumer implements Runnable {

    private Exchanger<String> ex;
    private String str;

    public StringConsumer(Exchanger<String> ex) {
        this.ex = ex;
        this.str = "";
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Consumer received"+str);
        }
    }
}
