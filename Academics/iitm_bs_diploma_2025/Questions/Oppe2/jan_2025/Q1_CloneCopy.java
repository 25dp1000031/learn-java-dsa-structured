package Academics.iitm_bs_diploma_2025.Questions.Oppe2.jan_2025;

import java.util.*;

public class Q1_CloneCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Project p1 = new Project("AI Development", 100000);
        Manager m1 = new Manager("Madhu", p1);
        Team t1 = new Team("Alpha", m1);
        Team t2 = t1.clone();
        t2.setTeamName(sc.nextLine());
        t2.setManager(new Manager(sc.nextLine(),

                new Project(sc.nextLine(), sc.nextDouble())));

        System.out.println("Team t1: " + t1);
        System.out.println("Team t2: " + t2);
        // ---
        demonstration d = new demonstration("Alpha", m1);
        demonstration d2 = d.clone();
        d2.setArr(0, 56);
        System.out.println(d.printArr());
        System.out.println(d2.printArr());
        sc.close();
    }
}

class Project implements Cloneable {
    private String proj_name;
    private double budget;

    public Project(String nm, double b) {
        proj_name = nm;
        budget = b;
    }

    public void setProjectName(String nm) {
        proj_name = nm;
    }

    public String toString() {
        return "Project: " + proj_name + ", budget: " + budget;
    }

    // Write code to implement clone() method
    public Project clone() throws CloneNotSupportedException {
        return (Project) super.clone();
    }
}

class Manager implements Cloneable {
    private String mngr_name;
    private Project proj;

    public Manager(String mn, Project p) {
        mngr_name = mn;
        proj = p;
    }

    public String toString() {
        return proj + "\n" + "Manager: " + mngr_name;
    }

    // Write code to implement clone() method
    public Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }
}

class Team implements Cloneable {
    private String teamName;
    private Manager mngr;

    public Team(String tn, Manager m) {
        teamName = tn;
        mngr = m;
    }

    public void setTeamName(String tn) {
        teamName = tn;
    }

    public void setManager(Manager m) {
        mngr = m;
    }

    public String toString() {
        return teamName + "\n" + mngr;
    }

    // Write code to implement clone() method
    public Team clone() throws CloneNotSupportedException {
        Team obj = (Team) super.clone();
        obj.mngr = mngr.clone();
        return obj;
        // return (Team) super.clone();
    }
}

// but what if we also need to copy an array like not a shallow copy but like a
// deep copy in that case
class demonstration implements Cloneable {
    private String teamName;
    private Manager mngr;
    private List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public demonstration(String tn, Manager m) {
        teamName = tn;
        mngr = m;
    }

    public void setTeamName(String tn) {
        teamName = tn;
    }

    public void setManager(Manager m) {
        mngr = m;
    }

    public void setArr(int idx, int data) {
        arr.set(idx, data);
    }

    public String toString() {
        return teamName + "\n" + mngr;
    }

    public List printArr() {
        return arr;
    }

    // Write code to implement clone() method
    public demonstration clone() throws CloneNotSupportedException {
        demonstration obj = (demonstration) super.clone();
        obj.mngr = mngr.clone();
        obj.arr = new ArrayList<>(arr);
        return obj;
        // return (demonstration) super.clone();
    }
}