import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeesBySalary {

    public static List<String> getSalaryMoreThan50K() {
        List<Employee> employees = Arrays.asList(
                new Employee("abc",  70000),
                new Employee("def",  45000),
                new Employee("ghi",  49000),
                new Employee("jkl",  60000)
        );

        return employees.stream()
                .filter(x -> x.salary > 50000)
                .map(employee -> employee.name)
                .collect(Collectors.toList());

    }
}

 class Employee {
     String name;
     double salary;

     public Employee(String name, double salary) {
         this.name = name;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public double getSalary() {
         return salary;
     }
 }

