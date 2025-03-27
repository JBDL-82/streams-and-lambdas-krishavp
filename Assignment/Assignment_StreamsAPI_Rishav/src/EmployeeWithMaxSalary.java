import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeWithMaxSalary {

    public static String getEmployeeWithMaxSalary() {
        List<Employee> employees = Arrays.asList(
                new Employee("abc",  70000),
                new Employee("def",  45000),
                new Employee("ghi",  49000),
                new Employee("jkl",  60000)
        );

        return employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName)
                .orElse("No Employee found");

    }
}


