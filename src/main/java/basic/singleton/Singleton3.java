package basic.singleton;

/**
 * @fileName: Singleton3
 * @author: Cloud
 * @create: 2020-05-05
 * @description: hungry mode, initialized when loading, not lazy loading
 * easy to have garbage, no lock leads to higher running efficiency.
 **/
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3 (){

    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
