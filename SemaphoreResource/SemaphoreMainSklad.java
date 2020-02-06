package semaphoreresource;

import semaphoreresource.Customer;
import semaphoreresource.Producer;
import semaphoreresource.Sklad;

import java.util.concurrent.Semaphore;

public class SemaphoreMainSklad {
    public static void main(String[] args) {
        Semaphore sProduce = new Semaphore(1);
        Semaphore sCustomer = new Semaphore(0);
        Sklad sklad = new Sklad(sProduce, sCustomer);
        Producer producer = new Producer(sklad, sProduce);
        Customer customer = new Customer(sklad, sCustomer);
    }
}
