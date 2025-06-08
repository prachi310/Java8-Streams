import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        //reduce your collection to one element
        List<Integer> list = Arrays.asList(1,2,3,4);

        Integer sum= list.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);


    }
}
