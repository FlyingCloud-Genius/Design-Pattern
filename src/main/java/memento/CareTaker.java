package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: CareTaker
 * @Auther: Cloud
 * @Create: 2020 - 06 - 24
 * @Description:
 **/

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
