import java.util.*;
import java.util.stream.Collectors;

public class Top3Salaries {

    public static String getTop3Salaries() {
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
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.joining(" ,"));

    }

}
