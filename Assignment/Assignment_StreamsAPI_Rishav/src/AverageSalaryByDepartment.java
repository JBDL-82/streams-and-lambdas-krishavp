import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {

    public static Map<String, Double> getAvgSalaryBuDepartment() {
        List<EmployeeDepartmentSalary> employeeDepartmentSalaries = Arrays. asList(
                new EmployeeDepartmentSalary("abc", "Marketing", 45000),
                new EmployeeDepartmentSalary("def", "Sales", 50000),
                new EmployeeDepartmentSalary("ghi", "Sales", 70000),
                new EmployeeDepartmentSalary("jkl", "Marketing", 40000),
                new EmployeeDepartmentSalary("mno", "Finance", 50000),
                new EmployeeDepartmentSalary("pqr", "Marketing", 55000),
                new EmployeeDepartmentSalary("stu", "Finance", 45000),
                new EmployeeDepartmentSalary("vwx", "Finance", 36000),
                new EmployeeDepartmentSalary("yz", "Sales", 42000)
        );

        return employeeDepartmentSalaries.stream().
                collect(Collectors.groupingBy(EmployeeDepartmentSalary::getDepartment,
                        Collectors.averagingDouble(EmployeeDepartmentSalary::getSalary)));
    }
}

class EmployeeDepartmentSalary {

    String name;
    String department;
    int salary;

    public EmployeeDepartmentSalary(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
