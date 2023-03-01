package tw.idv.kunfei;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private Employee leader;
    private List<Employee> members;

    public Team(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    public List<Employee> getMembers() {
        return members;
    }

    public Employee getMember(int idx) {
        return members.get(idx);
    }

    public void setMember(int idx, Employee employee) {
        members.set(idx, employee);
    }

    public void addMember(Employee employee) {
        members.add(employee);
        if (members.size() == 1) {
            leader = employee;
        }
    }

    public void removeMember(Employee employee) {
        members.remove(employee);
        if (employee.equals(leader) && members.size() > 0) {
            leader = members.get(0);
        }
    }

    public void promote(Employee newLeader) {
        if (!members.contains(newLeader)) {
            throw new IllegalArgumentException("The new leader must be a member of the team.");
        }
        leader = newLeader;
    }
}
