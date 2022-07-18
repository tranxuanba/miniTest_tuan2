package model;

public class PasstimeEmployee extends Employee{
    private int workingHours;

    @Override
    public int getSalary() {
        return workingHours * 100000;
    }

    public PasstimeEmployee() {
    }

    public PasstimeEmployee(int workingHours) {
        this.workingHours = workingHours;
    }

    public PasstimeEmployee(int employeeId, String name, int age, int phoneNumber, String email, int workingHours) {
        super(employeeId, name, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "passtimeEmployee{" +
                "workingHours=" + workingHours +
                '}';
    }
}
