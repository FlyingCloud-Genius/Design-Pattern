package singleton;

/**
 * @fileName: Singleton1
 * @description: lazy mode, not thread safe
 * @author: Cloud
 * @create: 2020-05-05
 **/
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
