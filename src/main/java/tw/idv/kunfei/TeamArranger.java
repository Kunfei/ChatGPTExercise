package tw.idv.kunfei;

import java.util.List;

public class TeamArranger {
    public static void main(String[] args) {
        // Read employees from CSV file
        List<Employee> employees = EmployeeReader.readEmployeesFromCSV("members.csv");
        System.out.println("Employee number: " + employees.size());
        // Generate teams with size 3
        List<Team> teams = TeamManager.generateTeams(employees, 3);

        // Print teams
        System.out.println("There are " + teams.size() + " teams.");
        for (Team team : teams) {
            //System.out.println(team.getMembers().size());
            System.out.print(team.getName() + " - ");
            for (Employee member : team.getMembers()) {
                System.out.print(" " + member.getName() + "(" + member.getDepartment() + ")");
            }
            System.out.println();
        }
    }
}
