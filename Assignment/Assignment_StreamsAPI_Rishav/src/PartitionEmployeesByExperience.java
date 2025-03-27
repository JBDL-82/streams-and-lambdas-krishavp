import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesByExperience {

    public static Map<String, List<String>> getPartitionedListOnExperience() {
        List<EmployeeWithExperience> employeeWithExperiences = Arrays. asList(
                new EmployeeWithExperience("abc", 3),
                new EmployeeWithExperience("def", 6),
                new EmployeeWithExperience("ghi", 7),
                new EmployeeWithExperience("jkl", 4),
                new EmployeeWithExperience("mno", 9),
                new EmployeeWithExperience("pqs", 1),
                new EmployeeWithExperience("stu", 3),
                new EmployeeWithExperience("vwx", 5),
                new EmployeeWithExperience("yz", 11)
        );

        /*List<String> employeesWithMoreThan5Years = employeeWithExperiences.stream()
                .filter(employeeWithExperience -> employeeWithExperience.getExperience() >=5)
                .map(EmployeeWithExperience::getName)
                .toList();

        List<String> employeeWithLessThan5years = employeeWithExperiences.stream()
                .filter(employeeWithExperience -> employeeWithExperience.getExperience() < 5)
                .map(EmployeeWithExperience::getName)
                .toList();

        Map<String, List<String>> result = new HashMap<>();
        result.put("Experience >= 5 years", employeesWithMoreThan5Years);
        result.put("Experience < 5 years", employeeWithLessThan5years);*/

        Map<Boolean, List<String>> partionedMap = employeeWithExperiences.stream()
                .collect(Collectors.partitioningBy(
                        employeeWithExperience -> employeeWithExperience.getExperience() >= 5,
                        Collectors.mapping(EmployeeWithExperience::getName, Collectors.toList())));

        Map<String, List<String>> result = new HashMap<>();
        result.put("Experience >= 5 years", partionedMap.get(true));
        result.put("Experience < 5 years", partionedMap.get(false));

        return result;

    }

}

class EmployeeWithExperience {

    String name;
    int experience;

    public EmployeeWithExperience(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }
}
