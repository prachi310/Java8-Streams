import java.util.Arrays;
import java.util.List;

public class SkipExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        //it will skip n elements from list

        list.stream().skip(2).forEach(System.out::println);
    }
}
