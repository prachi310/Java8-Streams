import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {

        //filter out duplicate elements
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,5);

        list.stream().distinct().forEach(System.out::println);


    }
}
