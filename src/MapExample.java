import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        //map will actually work as transformer
        // it will convert your input to some other format

        List<String> names = Arrays.asList("alice", "bob","chris");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
