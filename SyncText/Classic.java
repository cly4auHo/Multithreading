package RunVasya;

public class Classic {

   synchronized void printText(String text) {
        
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

