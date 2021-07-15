package basic.observer;

/**
 * @FileName: OctalObserver
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " +
                Integer.toOctalString(subject.getState()));
    }
}
