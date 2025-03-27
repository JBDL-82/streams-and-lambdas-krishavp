import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNameInitialMap {

    public static Map<Character, List<String>> getEmployeeListWithFirstCharacter(List<String> names) {

        return names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
    }
}
