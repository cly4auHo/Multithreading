package RunVasya;

public class Classic {

    private Object a = new Object();

    void  printText(String text) {
        synchronized (a) {
            System.out.print("[");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print(text);
            System.out.print("]");
        }
    }
}
