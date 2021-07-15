package basic.state;

/**
 * @FileName: StartState
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start basic.state");
        context.setState(this);
    }
    public String toString() {
        return "Start State";
    }
}
