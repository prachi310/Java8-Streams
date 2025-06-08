import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {

        //get first element after performing operations

        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> firstN= number.stream().filter(x->x%2==0).findFirst();

        System.out.println(firstN.get());

    }
}
