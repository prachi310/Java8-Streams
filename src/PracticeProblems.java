import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeProblems {

    public static void main(String[] args) {

        //1. even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 6);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        //2. convert list of string to uppercase
        List<String> list = Arrays.asList("abc", "allen", "bob", "cat");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //3. count occurrences of each word
        List<String> nameList = Arrays.asList("apple", "banana", "apple", "lichi", "banana", "apple");
        Map<String, Long> countList = nameList.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        //count in Integer
        Map<String, Integer> countInt = nameList.stream()
                .collect(Collectors.groupingBy(w -> w,
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));

        countInt.forEach((name, count) -> {
            System.out.println(name + ":" + count);
        });


        //4.Remove Duplicates
        nameList.stream().distinct().forEach(System.out::println);

        //5. Sum of all elements
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        //alternative way
        int result = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);


        //IMP - advanced problems
        //6.find first non-repeating character in string
        String input = "aabccdee";
        Optional<Character> charR = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(charR.get());

        // 7.sort employee by salary
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice", "HR", 10000),
                new Employee("bob", "Finance", 30000),
                new Employee("chris", "HR", 20000),
                new Employee("Dave", "IT", 25000)
        );

        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);

        //8. group employee by department
        Map<String, List<Employee>> resList = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));

        resList.forEach((dept, employee) -> {
            System.out.println("Department: " + dept);
            employee.forEach(System.out::println);
        });

        //9. Join strings with deliminator
        List<String> stringList = Arrays.asList("abc", "pqr", "xyz", "lmn");
        String resString = stringList.stream().collect(Collectors.joining(","));

        System.out.println(resString);

        //alternative way
        Optional<String> resString1 = stringList.stream().reduce((a, b) -> a + "," + b);
        System.out.println(resString1.get());

        //10. get top3 highest numbers
        List<Integer> nums = Arrays.asList(20, 60, 90, 80);
        nums.stream().sorted(Comparator.reverseOrder()).
                limit(3).forEach(System.out::println);

        //11.partition list into even and odd
        List<Integer> partList = Arrays.asList(10, 34, 35, 79, 58);
        Map<Boolean, List<Integer>> resultList =
                partList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("even number list");
        resultList.get(true).forEach(System.out::println);

        //12.Flatten map
        List<List<String>> flatList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("p", "q")
        );

        flatList.stream().flatMap(Collection::stream).map(String::toUpperCase).
                forEach(System.out::println);

        //13.Find second highest Number
        List<Integer> numbers1 = Arrays.asList(10, 34, 35, 79, 58);

        Optional<Integer> resN = numbers1.stream().sorted(Comparator.reverseOrder()).
                skip(1).findFirst();

        System.out.println("2nd heighest num: " + resN.get());


        //14. find employee with max salary per department
        List<Employee> employeeList1 = Arrays.asList(
                new Employee("Raj", "Dict", 70000),
                new Employee("Dipak", "mgr", 50000),
                new Employee("srini", "mgr", 65000),
                new Employee("prachi", "Tech", 20000),
                new Employee("nikhila", "Tech", 30000)
        );

       Map<String, Optional<Employee>> resultMax= employeeList1.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment,
               Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

       resultMax.forEach((dept,emp)->{
           System.out.println(dept +":"+emp.get());
        });

       //15.Frequency of Characters in a String
        String s="prachi";
        Map<Character,Long> resChar=s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        resChar.forEach((c,f)->{
            System.out.println(c +": "+ f);
        });



    }


}
