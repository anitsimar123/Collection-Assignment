public class Employee {
    String first_name;
    String last_name;
    int age;
    String designation;

     Employee(){
        first_name = null;
        last_name = null;
        age=0;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public String toString() {
        return
                "first_name=" + first_name +
                ", last_name=" + last_name +
                ", age=" + age +
                ", designation=" + designation;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    Employee(String first_name, String last_name, int age, String designation){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.designation = designation;
    }

    Employee(Employee e){
         first_name = e.first_name;
         last_name = e.last_name;
         age = e.age;
         designation = e.designation;
    }
}
