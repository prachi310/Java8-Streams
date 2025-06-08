import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4);

        Optional<Integer> minN= number.stream().min(Comparator.naturalOrder());
        System.out.println(minN.get());

        Optional<Integer> maxN= number.stream().max(Comparator.naturalOrder());
        System.out.println(maxN.get());

    }
}
