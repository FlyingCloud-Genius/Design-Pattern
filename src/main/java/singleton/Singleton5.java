package singleton;

/**
 * @fileName: Singleton5
 * @author: Cloud
 * @create: 2020-05-05
 * @description: registering and inside static
 **/
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5 (){

    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
