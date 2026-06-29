package StreamAPI;
import java.util.*;
public class DataBase {
    public static void main(String[] args) {
       List<Employee> emp = Arrays.asList(
               new Employee(101, "shahid", "Developer", 80000),
               new Employee(102, "Rahul", "Tester", 45000),
               new Employee(103, "Ajay", "Developer", 95000),
               new Employee(104, "Kiran", "HR", 35000),
               new Employee(105, "Ravi", "Developer", 70000)
       );


       emp.stream()
               .forEach(e->e.print());
   }
}
