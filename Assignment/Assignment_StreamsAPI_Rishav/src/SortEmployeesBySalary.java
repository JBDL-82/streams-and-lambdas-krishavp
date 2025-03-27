import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesBySalary {

    public static List<String> getEmployeesSortedBySalary() {
        List<Employee> employees = Arrays.asList(
                new Employee("abc",  70000),
                new Employee("def",  45000),
                new Employee("ghi",  49000),
                new Employee("jkl",  60000),
                new Employee("mno",  45000),
                new Employee("pqr",  72000),
                new Employee("stu",  80000),
                new Employee("vwx",  62000),
                new Employee("yz",  49000)
        );

        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList();

    }
}
