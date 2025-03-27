import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {

    public static Map<String, List<String>> groupEmployeesByDepartment() {
        List<EmployeeWithDepartment> employeeWithDepartments = Arrays. asList(
                new EmployeeWithDepartment("abc", "Sales"),
                new EmployeeWithDepartment("def", "Marketing"),
                new EmployeeWithDepartment("ghi", "Sales"),
                new EmployeeWithDepartment("jkl", "Sales"),
                new EmployeeWithDepartment("mno", "Marketing"),
                new EmployeeWithDepartment("pqs", "Finance"),
                new EmployeeWithDepartment("stu", "Finance"),
                new EmployeeWithDepartment("vwx", "Finance"),
                new EmployeeWithDepartment("yz", "Finance")

        );
        return employeeWithDepartments.stream()
                .collect(Collectors.groupingBy(EmployeeWithDepartment::getDepartment,
                        Collectors.mapping(EmployeeWithDepartment::getName, Collectors.toList())));
    }

}

class EmployeeWithDepartment {
    String name;
    String department;

    public EmployeeWithDepartment(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
