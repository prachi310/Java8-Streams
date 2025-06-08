import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class flatMap {

    public static void main(String[] args) {

        //when you have complex data structure
        // we can use flatmap to perform operations

      List<List<String>> list = Arrays.asList(
              Arrays.asList("a","b"),
              Arrays.asList("b","c"),
              Arrays.asList("d","e")
      );

      list.stream().
              flatMap(Collection::stream)
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}
