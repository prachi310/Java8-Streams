import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {

    public static void main(String[] args) {

        //peek will not modify your list but perform some operations like printing list
        List<Integer> list = Arrays.asList(1,2,3,4);

        list.stream()
                .map(n->n*n)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
