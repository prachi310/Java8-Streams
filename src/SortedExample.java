import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {

        //sort the elements by default in ASC

        List<Integer> list = Arrays.asList(10,70,30,40,80);

        list.stream().sorted().
                forEach(System.out::println);
        //dsc
        list.stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);

        //sort based on length of string
        List<String> stringList = Arrays.asList("kiwi","banana","dragon","peer");
        stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
