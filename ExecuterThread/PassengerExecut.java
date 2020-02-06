package executerthread;

import java.util.Random;

public class PassengerExecut implements Runnable {

    private String name;

    public PassengerExecut(String name) {
        this.name = name;
    }

    public void run() {
        int timeToSleep = new Random().nextInt(6) + 3; // 3-8
        System.out.println(name + " going to bus");

        try {
            Thread.sleep(timeToSleep * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " in Bus");
    }
}
