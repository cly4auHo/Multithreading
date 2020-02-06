package cyclicbarriermain;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {
    public static void main(String[] args) {
        CyclicBarrier cdl = new CyclicBarrier(3, () -> System.out.println("GO"));
        //CyclicBarrier cdl = new CyclicBarrier(3, new Bus());

        Passenger a = new Passenger("A", cdl);
        Passenger b = new Passenger("B", cdl);
        Passenger c = new Passenger("C", cdl);
        Passenger d = new Passenger("D", cdl);
        Passenger e = new Passenger("E", cdl);
        Passenger f = new Passenger("F", cdl);
    }
}
