import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int age;

    private Double salary;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(String name, int age, Double salary){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee employee) {
        Integer i = this.age;
        Integer i1 = employee.age;
        return i.compareTo(i1);
    }
}
