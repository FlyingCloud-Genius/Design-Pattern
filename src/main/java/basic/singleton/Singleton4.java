package basic.singleton;

/**
 * @fileName: Singleton4
 * @author: Cloud
 * @create: 2020-05-05
 * @description: double-checked locking
 **/
public class Singleton4 {
    private volatile static Singleton4 singleton;

    private Singleton4 (){

    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
