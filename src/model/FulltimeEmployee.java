package model;

public class FulltimeEmployee extends Employee implements Comparable<Employee>{
    private int bonus;
    private int fines;
    private int salaryHard;

    public FulltimeEmployee() {
    }

    @Override
    public int compareTo(Employee o) {
        return this.salaryHard - o.getSalary();
    }

    @Override
    public int getSalary() {
        int salary = salaryHard + bonus - fines;
        return salary;
    }

    public FulltimeEmployee(int bonus, int fines, int salaryHard) {
        this.bonus = bonus;
        this.fines = fines;
        this.salaryHard = salaryHard;
    }

    public FulltimeEmployee(int employeeId, String name, int age, int phoneNumber, String email, int bonus, int fines, int salaryHard) {
        super(employeeId, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fines = fines;
        this.salaryHard = salaryHard;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public float getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public float getSalaryHard() {
        return salaryHard;
    }

    public void setSalaryHard(int salaryHard) {
        this.salaryHard = salaryHard;
    }

    @Override
    public String toString() {
        return "fulltimeEmployee{" +
                "bonus=" + bonus +
                ", fines=" + fines +
                ", salaryHard=" + salaryHard +
                '}';
    }

}
