package basic.singleton;

/**
 * @fileName: Singleton2
 * @author: Cloud
 * @create: 2020-05-05
 * @description: lazy mode, thread safe. Initialized only once
 * thread safe here means no matter what calls the function, the
 * can respond correctly.
 **/
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2 (){

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
