package exchangerthread;

import java.util.concurrent.Exchanger;

public class StringProducer implements Runnable {

    private Exchanger<String> ex;
    private String str;

    public StringProducer(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char c = (char) ((int) (Math.random() * 64 + 62));
                str += c;
            }

            try {
                System.out.println("Producer send" + str);
                str = ex.exchange(str);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
