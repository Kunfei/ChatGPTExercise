package tw.idv.kunfei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TeamManager {
    private static Random rand = new Random();

    public static List<Team> generateTeams(List<Employee> employees, int teamSize) {
        // 打亂每個員工順序
        Collections.shuffle(employees);

        // 按照順序將員工加入小組, 額滿就換下一個小組
        List<Team> teams = new ArrayList<>();
        Team team = null;
        System.out.println("There are " + employees.size() + " employees.");
        for (Employee employee: employees) {
            if (team == null)
                team = new Team(TeamNameGenerator.generateTeamName());
            if (team.getMembers().size() < teamSize) {
                team.addMember(employee);
            } else {
                teams.add(team);
                team = new Team(TeamNameGenerator.generateTeamName());
                team.addMember(employee);
            }
        }

        // 未滿額的仍成為一個小組
        if (team != null)
            teams.add(team);

        return teams;
    }
}

