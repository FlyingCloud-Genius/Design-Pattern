package basic.keyword;

public class VolatileDemo  {

    static boolean shutdownRequested;

    public void shutdown() {
        shutdownRequested = true;
    }

    public static void main(String[] args) {
        new Thread(() -> {
            while (!shutdownRequested) {
                try {
                    Thread.sleep(100);
                    System.out.println("looping");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("shut down");
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shutdownRequested = true;
        System.out.println("value changed");
    }
}
