import java.util.Arrays;
import java.util.List;

public class SumExample {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = number.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }
}
