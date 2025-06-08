import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice","HR",10000),
                new Employee("bob","Finance", 30000),
                new Employee("chris","HR",20000),
                new Employee("Dave","IT",25000)
        );

        Map<String,List<Employee>> result= employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));

        result.forEach((dept, employees)->{
            System.out.println("Department: " + dept);
            employees.forEach(System.out::println);
        });
    }
}
