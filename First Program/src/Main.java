import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creating object using default constructor");
        Employee e1 = new Employee();
        System.out.println("Employee1 Details: \n"+e1);
        e1.setFirst_name("Amritpal");
        e1.setLast_name("Singh");
        e1.setAge(23);
        e1.setDesignation("Software Engineer");

        System.out.println("\nAfter calling setter method\nEmployee1 Details:");
        System.out.println(e1);

        System.out.println("\nCreating object using parameterized constructor\nEmployee2 Details: ");
        Employee e2 = new Employee("Rakesh","Kumar",26,"Software Engineer");
        System.out.println(e2);

        System.out.println("\nCreating object using copy constructor\nEmployee3 Details: ");
        Employee e3 = new Employee(e1);
        System.out.println(e3);


    }
}