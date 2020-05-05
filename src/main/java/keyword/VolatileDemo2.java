package keyword;

public class VolatileDemo2 {
    private static volatile boolean bChanged;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {

            @Override
            public void run() {
                for (;;) {
                    if (bChanged == !bChanged) {
                        System.out.println("!=");
                        System.exit(0);
                    }
                }
            }
        }.start();
        Thread.sleep(100);
        new Thread() {

            @Override
            public void run() {
                bChanged = !bChanged;
            }
        }.start();
    }

}
