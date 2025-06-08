import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {

        //filter will be like predicate boolean valued

        List<Integer> numbers  = Arrays.asList(1,2,3,4,5);
        numbers.stream().filter(n-> n%2==0)
                .forEach(System.out::println);
    }
}
