package complicated.combined;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Cloud Yang
 * @Date: 2021/7/14
 **/
public class Team extends TeamComponent {

    public Team(String name) {
        super(name);
    }

    @Override
    public void walkThrough(String levelDeep) {
        System.out.println(levelDeep + this.getName());
        List<TeamComponent> teamComponentsOnCurrentLevel = new ArrayList<>();
        for (TeamComponent teamComponent : teamComponents) {
            if (teamComponent instanceof Member) {
                teamComponent.walkThrough(levelDeep + "-");
            } else if (teamComponent instanceof  Team) {
                teamComponentsOnCurrentLevel.add(teamComponent);
            }
        }
        if (teamComponentsOnCurrentLevel.size() > 0) {
            for (TeamComponent teamComponent : teamComponentsOnCurrentLevel) {
                teamComponent.walkThrough(levelDeep + "_");
            }
        }
    }

    @Override
    public void addComponent(TeamComponent teamComponent) {
        teamComponents.add(teamComponent);
        System.out.println(this.getName() + " add element " + teamComponent.getName());
    }
}
