package basic.state;

/**
 * @FileName: StopSate
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Stop basic.state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
