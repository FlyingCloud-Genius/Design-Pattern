package state;

/**
 * @FileName: Context
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
