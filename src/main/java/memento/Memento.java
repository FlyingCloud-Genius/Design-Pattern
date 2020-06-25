package memento;

/**
 * @FileName: Memento
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
