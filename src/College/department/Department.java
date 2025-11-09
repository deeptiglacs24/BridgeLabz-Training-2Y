package College.department;

public class Department {
    private String deptName;
    private int strength;

    public Department(String deptName, int strength) {
        this.deptName = deptName;
        this.strength = strength;
    }

    public String getDeptName() { return deptName; }
    public int getStrength() { return strength; }

    public void display() {
        System.out.println("Department: " + deptName + ", Strength: " + strength);
    }
}
