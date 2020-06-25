package observer;

/**
 * @FileName: HexaObserver
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " +
                Integer.toHexString(subject.getState()).toUpperCase());
    }
}
