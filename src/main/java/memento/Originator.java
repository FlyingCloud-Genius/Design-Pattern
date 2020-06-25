package memento;

/**
 * @FileName: Originator
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
