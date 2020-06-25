package observer;

/**
 * @FileName: Observer
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
