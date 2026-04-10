package EmployeeManagementSystem;
public class FullTimeEmployee extends Employee implements Department {
    private double monthlySalary;
    private double bonus;
    private String departmentName;

    public FullTimeEmployee(int id, String name, double salary, double bonus) {
        setEmployeeId(id);
        setName(name);
        this.monthlySalary = salary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        setBaseSalary(monthlySalary + bonus);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}