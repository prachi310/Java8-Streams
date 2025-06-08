import java.util.Arrays;
import java.util.List;

public class AnyNumber {

    public static void main(String[] args) {

        //check the condition for any number in the list
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        Boolean res = number.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(res);
    }
}
