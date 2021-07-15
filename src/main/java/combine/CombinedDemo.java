package combine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Cloud Yang
 * @Date: 2021/7/15
 * @Description: this is more of a kind of advanced composite pattern demo
 **/
public class CombinedDemo {

    public static void main(String[] args) {
        Member director = new Member("总监");
        List<String> members = new ArrayList<>();
        members.add("group mate 1");
        members.add("group mate 2");
        members.add("group mate 3");
        Team techTeam1 = buildTeam("group1", members);
        Team techTeam2 = buildTeam("group2", members);
        Team bg = new Team("Tech Team");
        bg.addComponent(techTeam1);
        bg.addComponent(techTeam2);
        bg.walkThrough("-");
    }

    public static Team buildTeam(String teamName, List<String> memberNames) {
        Team team = new Team(teamName);
        for (String memberName : memberNames) {
            Member member = new Member(memberName);
            team.addComponent(member);
        }
        return team;
    }
}
