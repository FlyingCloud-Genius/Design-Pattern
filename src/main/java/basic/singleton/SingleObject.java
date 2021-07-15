package basic.singleton;

public class SingleObject {

    //only object
    private static SingleObject instance = new SingleObject();

    //prevent from initialization
    private SingleObject() {

    }

    //only usable object
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
