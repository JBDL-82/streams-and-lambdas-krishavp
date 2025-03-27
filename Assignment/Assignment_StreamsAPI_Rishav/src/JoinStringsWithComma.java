import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithComma {

    public static String getCommaSeparatedMixedString (List<String> stringList) {

        //String result = String.join(",", stringList);

        String result = stringList.stream().collect(Collectors.joining(","));
        return result;
    }
}
