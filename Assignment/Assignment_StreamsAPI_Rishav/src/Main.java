import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(FilterEmployeesBySalary.getSalaryMoreThan50K());
        List<String> listOfWords = Arrays.asList("apple", "banana", "apple");
        System.out.println(WordFrequencyCounter.frequencyOfWords(listOfWords));
        System.out.println(GroupEmployeesByDepartment.groupEmployeesByDepartment());
        System.out.println(EmployeeWithMaxSalary.getEmployeeWithMaxSalary());
        System.out.println(JoinStringsWithComma.getCommaSeparatedMixedString(Arrays.asList("Java", "Python", "C++")));
        List<Integer> lisOfIntegers = Arrays.asList(1, 2, 3, 1, 1, 5, 5, 6, 9, 11, 9, 13, 17, 11, 15, 24, 43, 11, 17, 43);
        System.out.println(RemoveDuplicateElements.getListWithoutDuplicates(lisOfIntegers));

        System.out.println(PartitionEmployeesByExperience.getPartitionedListOnExperience());

        System.out.println(AverageSalaryByDepartment.getAvgSalaryBuDepartment());
        System.out.println(Top3Salaries.getTop3Salaries());

        System.out.println(SortEmployeesBySalary.getEmployeesSortedBySalary());

        System.out.println(DepartmentsWithNoEmployees.getDepartmentWithNoEmployee());

        System.out.println(EmployeeNameInitialMap.getEmployeeListWithFirstCharacter(Arrays.asList("Alice", "Andrew", "Bob")));
    }
}