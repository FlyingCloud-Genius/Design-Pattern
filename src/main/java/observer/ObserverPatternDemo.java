package observer;

/**
 * @FileName: ObserverPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 * 1. This pattern shows a combination of the trigger and the business.
 * 2. It can only be used when one object is dependent on the other.
 * 2. The observer knows the change but don not know how the changes happened.
 * 4. It can be set with a chain of activation.
 **/

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
