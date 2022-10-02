public class Student {
    static String firstName;
    static String lastName;
    static int age;

    static{
        firstName = "Amritpal";
        lastName = "Singh";
        age = 23;
    }

    public static void display(){
        System.out.println("FirstName: "+Student.firstName+"\nLastName: "+Student.lastName+"\nAge: "+Student.age);
    }

    public static void main(String[] args) {
        display();
    }
}
