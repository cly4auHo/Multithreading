package executerthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutSer {
    public static void main(String[] args) {
        ExecutorService exs = Executors.newFixedThreadPool(2);
        PassengerExecut a = new PassengerExecut("A");
        PassengerExecut b = new PassengerExecut("B");
        PassengerExecut c = new PassengerExecut("C");
        PassengerExecut d = new PassengerExecut("D");
        exs.execute(a);
        exs.execute(b);
        exs.execute(c);
        exs.execute(d);
        exs.shutdown();
    }
}
