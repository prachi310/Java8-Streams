import java.util.Arrays;
import java.util.List;

public class Count {

    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        long count = number.stream().count();
        System.out.println(count);
    }
}
