package complicated.combined;

/**
 * @Author：Cloud Yang
 * @Date: 2021/7/14
 **/
public class Member extends TeamComponent {

    public Member(String name) {
        super(name);
    }

    @Override
    public void walkThrough(String levelDeep) {
        System.out.println(levelDeep + this.getName());
    }

    @Override
    public void addComponent(TeamComponent teamComponent) {
        System.out.println("ERROR: no element can be added!");
    }
}
