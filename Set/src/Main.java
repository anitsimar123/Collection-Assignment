import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Anshuman", 21, 100.0);
        Employee employee2 = new Employee("Neelesh", 20, 80.0);
        Employee employee3 = new Employee("Archit", 21, 90.0);
        Employee employee4 = new Employee("Pushkar", 22, 120.0);
        Employee employee5 = new Employee("Prateek", 23, 100.0);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else if (e1.getSalary() == e2.getSalary()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Employess in decreasing order of salary");
        Collections.reverse(employeeList);
        for (Employee e : employeeList) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}