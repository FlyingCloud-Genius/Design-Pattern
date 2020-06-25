package observer;

/**
 * @FileName: BinaryObserver
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " +
                Integer.toBinaryString(subject.getState()));
    }
}
