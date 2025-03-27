import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentsWithNoEmployees {

    public static String getDepartmentWithNoEmployee() {

        List<String> departments = Arrays.asList("HR", "IT", "Finance", "Sales", "Marketing");

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

        List<String> deptWithEmployees =  employeeWithDepartments.stream()
                .map(EmployeeWithDepartment::getDepartment)
                .distinct()
                .toList();

        return  departments.stream()
                .filter(dept -> !deptWithEmployees.contains(dept))
                .collect(Collectors.joining(" ,"));
    }
}
