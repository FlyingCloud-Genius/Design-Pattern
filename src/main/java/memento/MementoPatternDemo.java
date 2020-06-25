package memento;

/**
 * @FileName: MementoPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 * 1. This is very good for rolling back.
 * 2. The encapsulation ensure the closeness of the state.
 * 3. This can be seen in the Ctrl + Z and the roll back in IE and Chrome.
 **/

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
