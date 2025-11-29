// Employee.java
public class Employee extends Person {
    private String staffId;
    private String role;

    public Employee() { super(); this.staffId = ""; this.role = ""; }

    public Employee(String id, String name, int age, String staffId, String role) {
        super(id, name, age);
        this.staffId = staffId;
        this.role = role;
    }

    public String getStaffId() { return staffId; }
    public void setStaffId(String staffId) { this.staffId = staffId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return String.format("%s StaffID:%s Role:%s", super.toString(), staffId, role);
    }
}
