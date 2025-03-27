import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    //static List<String> words = Arrays.asList("apple", "banana", "apple");

    public static Map<String, Long> frequencyOfWords(List<String> words) {

        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
