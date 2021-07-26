package complicated.combined;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Cloud Yang
 * @Date: 2021/7/14
 **/
public abstract class TeamComponent {

    private String name;

    protected List<TeamComponent> teamComponents = new ArrayList<>();

    public TeamComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void walkThrough(String levelDeep);

    public abstract void addComponent(TeamComponent teamComponent);
}
