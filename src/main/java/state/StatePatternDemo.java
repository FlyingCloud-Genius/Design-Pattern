package state;

/**
 * @FileName: StatePatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 * 1.Use encapsulation to change the dependency relationship.
 * 2. Each state will need to have one corresponding class. Make the System much bigger.
 * 3. It can be changed with the use of the theme. Better to use under finite state.
 **/

public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
