package StreamAPI;

public class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void print() {

        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);

    }
}
