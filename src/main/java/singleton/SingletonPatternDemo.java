package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        //inappropriate
        //private method not accessible
        //SingleObject object = new SingleObject();

        //only usable object (only one instance is allowed)
        SingleObject object = SingleObject.getInstance();

        //message display
        object.showMessage();

        reflect();
    }

    //reflect with singleton
    private static void reflect() {
        Class single = null;
        try {
            single = SingleObject.class;
            Object object = single.newInstance();
            Constructor constructor = single.getConstructor(single);
            object = constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
