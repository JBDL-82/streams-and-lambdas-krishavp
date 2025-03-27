import java.util.List;

public class RemoveDuplicateElements {

    public static List<Integer> getListWithoutDuplicates(List<Integer> integerList){

        return integerList.stream()
                .distinct().toList();
    }
}
