import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertToStream {
    public static void main(String[] args) {

        int [] primitiveArray = {1,2,3,4,5};
        Integer[] objectArray ={6,7,8,9};
        List<Integer> arrayList = Arrays.asList(10,11,12,13);

        Arrays.stream(primitiveArray).forEach(System.out::println);
        Stream.of(objectArray).forEach(System.out::println);
        arrayList.stream().forEach(System.out::println);

    }
}