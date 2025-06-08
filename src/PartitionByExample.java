import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {

    public static void main(String[] args) {

        //print employee whose salary less than and more than 50000
        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice","HR",80000),
                new Employee("bob","Finance", 30000),
                new Employee("chris","HR",70000),
                new Employee("Dave","IT",25000)
        );

       Map<Boolean,List<Employee>> resultList= employeeList.stream()
               .collect(Collectors.partitioningBy(employee -> employee.getSalary()>50000));

       System.out.println("employee with salary greater than 50000");
       resultList.get(true).forEach(System.out::println);

       System.out.println("employee with salary less than 50000");
       resultList.get(false).forEach(System.out::println);

    }
}
