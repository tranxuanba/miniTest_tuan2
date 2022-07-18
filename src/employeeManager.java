import model.Employee;
import model.FulltimeEmployee;
import model.PasstimeEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class employeeManager {
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        FulltimeEmployee nv1 = new FulltimeEmployee(1, "ba", 27, 123, "thoitran", 120000, 1201, 12000000);
        FulltimeEmployee nv2 = new FulltimeEmployee(2, "binh", 26, 1234, "thoitran1", 120006, 122, 18000000);
        FulltimeEmployee nv3 = new FulltimeEmployee(3, "sau", 25, 1235, "thoitran2", 1200, 120, 14000000);
        FulltimeEmployee nv4 = new FulltimeEmployee(4, "bay", 27, 1236, "thoitran3", 120000, 120, 15000000);
        FulltimeEmployee nv5 = new FulltimeEmployee(5, "tam", 29, 1237, "thoitran4", 12000, 120, 16000000);

        PasstimeEmployee nv6 = new PasstimeEmployee(6, "chin", 23, 1234, "thoitran5", 6);
        PasstimeEmployee nv7 = new PasstimeEmployee(7, "muoi", 24, 12345, "thoitran6", 4);
        PasstimeEmployee nv8 = new PasstimeEmployee(8, "nam", 25, 12346, "thoitran7", 8);
        PasstimeEmployee nv9 = new PasstimeEmployee(9, "ba", 26, 12347, "thoitran8", 4);
        PasstimeEmployee nv10 = new PasstimeEmployee(10, "cuu", 27, 12347, "thoitran9", 5);

        employees.add(nv1);
        employees.add(nv2);
        employees.add(nv3);
        employees.add(nv4);
        employees.add(nv5);
        employees.add(nv6);
        employees.add(nv7);
        employees.add(nv8);
        employees.add(nv9);
        employees.add(nv10);

        System.out.println(getPartimeUnderSalary());
        System.out.println(sumPartimeSalary());
        //Collections.sort(employees);
        System.out.println(employees);
        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        System.out.println(employees);
    }

    public static float getAverageSalary() {
        float sum = 0;
        float average;
        for (Employee e:
             employees) {
            sum += e.getSalary();
        }
        average = sum/employees.size();
        return average;
    }

    public static ArrayList<Employee> getPartimeUnderSalary() {
        ArrayList<Employee> employeesArrayList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            float averege = getAverageSalary();
            if (isaBoolean(i) && employees.get(i).getSalary() < averege) {
                employeesArrayList.add(employees.get(i));
            }
        }
        return employeesArrayList;
    }

    public static float sumPartimeSalary() {
        float sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (isaBoolean(i)) {
                sum += employees.get(i).getSalary();
            }
        }
        return sum;
    }

//    public static ArrayList<Employee> employeeSort() {
//        ArrayList<Employee> employeesArrayList = new ArrayList<>();
//        for (int i = 0; i < employees.size(); i++) {
//            if (isaBoolean(i)) {
//
//                employeesArrayList.add(employees.get(i));
//            }
//        }
//        return employeesArrayList;
//    }

    private static boolean isaBoolean(int i) {
        return employees.get(i) instanceof PasstimeEmployee;
    }
}
