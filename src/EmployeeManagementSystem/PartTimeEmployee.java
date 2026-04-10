package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int hoursWorked;
    private String departmentName;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        setEmployeeId(id);
        setName(name);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    public void calculateSalary() {
        setBaseSalary(hourlyRate * hoursWorked);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName + " (Contractual)";
    }
}